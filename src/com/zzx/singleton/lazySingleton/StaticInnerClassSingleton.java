package com.zzx.singleton.lazySingleton;

/**
 * @ClassName StaticInnerClassSingleton
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 19:52
 * Version 1.0
 **/
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton() {
        // 私有的构造器是必须要有的，否则外部就要new出来了
    }
}
