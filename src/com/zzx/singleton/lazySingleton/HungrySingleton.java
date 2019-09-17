package com.zzx.singleton.lazySingleton;

/**
 * @ClassName HungrySingleton
 * @Description
 * @Author zhangzx
 * @Date 2019/9/17 11:06
 * Version 1.0
 **/
public class HungrySingleton {
    // 类初始化的时候加载，可以设置成不可改
    private final static HungrySingleton hungrySingleton;

    static {
        // 恶汉在类加载的时候，就初始化，所以可以使用final，而懒汉不可以
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
