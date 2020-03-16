package com.git.hui.java;

/**
 * Created by @author yihui in 22:07 20/3/15.
 */
public class DemoClz {

    public int print(int i) {
        System.out.println("print: " + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i + 2;
    }

    public int count(int i) {
        System.out.println("count: " + i);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i + 1;
    }
}
