package com.zzx.singleton.lazySingleton;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 19:00
 * Version 1.0
 **/
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        // DoubleCheck双重检查
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
