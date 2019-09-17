package com.zzx.singleton.lazySingleton;

/**
 * @ClassName T
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 17:52
 * Version 1.0
 **/
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + instance);
    }
}
