package com.git.hui.java;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

/**
 * Created by @author yihui in 19:48 20/3/15.
 */
public class AttachMain {


    public static void main(String[] args)
            throws IOException, AgentLoadException, AgentInitializationException, AttachNotSupportedException {
        // 用jps -l 查出目标应用的进程号，替换下面的参数
        VirtualMachine vm = VirtualMachine.attach("36633");
        // 用你自己的agent绝对地址替换
        vm.loadAgent(
                "/Users/user/Project/GitHub/study-demo/java-agent/target/java-agent-1.0-SNAPSHOT-jar-with-dependencies.jar");
    }

}
