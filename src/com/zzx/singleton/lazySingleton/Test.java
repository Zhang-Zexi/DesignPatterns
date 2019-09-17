package com.zzx.singleton.lazySingleton;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 17:48
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
