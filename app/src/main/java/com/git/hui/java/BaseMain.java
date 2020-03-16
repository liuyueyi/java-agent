package com.git.hui.java;

/**
 * Created by @author yihui in 19:41 20/3/15.
 */
public class BaseMain {

    public int print(int i) {
        System.out.println("i: " + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (i > 5) {
            // 主要是为了演示抛异常，也会执行方法耗时统计的case
            throw new RuntimeException();
        }

        return i + 2;
    }

    public void run() {
        int i = 1;
        while (true) {
            try {
                i = print(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BaseMain main = new BaseMain();
        main.run();
//
//        DemoClz demoClz = new DemoClz();
//        int cnt = 0;
//        for (int i = 0; i < 20; i++) {
//            if (++cnt % 2 == 0) {
//                i = demoClz.print(i);
//            } else {
//                i = demoClz.count(i);
//            }
//        }
    }
}
