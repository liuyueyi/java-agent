package com.git.hui.agent;

import java.lang.instrument.Instrumentation;

/**
 * Created by @author yihui in 16:39 20/3/15.
 */
public class SimpleAgent {

    /**
     * jvm 参数形式启动，运行此方法
     *
     * manifest需要配置属性Premain-Class
     *
     * @param agentArgs
     * @param inst
     */
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("premain");
    }

    /**
     * 动态 attach 方式启动，运行此方法
     *
     * manifest需要配置属性Agent-Class
     *
     * @param agentArgs
     * @param inst
     */
    public static void agentmain(String agentArgs, Instrumentation inst) {
        System.out.println("agentmain");
    }
}
