package com.zzx.singleton.lazySingleton;

/**
 * @ClassName LazySingleton
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 17:47
 * Version 1.0
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
