package com.zzx.singleton.lazySingleton;

import java.io.Serializable;

/**
 * @ClassName HungrySingleton
 * @Description
 * @Author zhangzx
 * @Date 2019/9/17 11:06
 * Version 1.0
 **/
public class HungrySingleton implements Serializable {
    // 类初始化的时候加载，可以设置成不可改
    private final static HungrySingleton hungrySingleton;

    static {
        // 恶汉在类加载的时候，就初始化，所以可以使用final，而懒汉不可以
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readObject() {
        return hungrySingleton;
    }
}
