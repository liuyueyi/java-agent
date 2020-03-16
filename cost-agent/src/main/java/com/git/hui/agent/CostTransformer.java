package com.git.hui.agent;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

import java.io.ByteArrayInputStream;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

/**
 * Created by @author yihui in 19:58 20/3/15.
 */
public class CostTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
            ProtectionDomain protectionDomain, byte[] classfileBuffer) {
        if (!className.startsWith("com/git/hui/java/")) {
            return classfileBuffer;
        }

        CtClass cl = null;
        try {
            ClassPool classPool = ClassPool.getDefault();
            cl = classPool.makeClass(new ByteArrayInputStream(classfileBuffer));

            for (CtMethod method : cl.getDeclaredMethods()) {
                // 我们统计一下所有的方法调用耗时
                method.addLocalVariable("start", CtClass.longType);
                method.insertBefore("start = System.currentTimeMillis();");
                String methodName = method.getLongName();
                // 请注意第二个参数，设置为true，则表示即便抛出异常了，下面的代码也会执行；相当于将它封装在finally里面了
                method.insertAfter("System.out.println(\"" + methodName + " cost: \" + (System" +
                        ".currentTimeMillis() - start));", true);
            }

            byte[] transformed = cl.toBytecode();
            return transformed;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classfileBuffer;
    }
}
