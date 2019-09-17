package com.zzx.singleton;

/**
 * @ClassName SingletonPattern
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 17:25
 * Version 1.0
 **/
@SuppressWarnings("all")
public class SingletonPattern {
//    private static SingletonPattern singletonPattern = null;
    private static final SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern() {

    }

//    public SingletonPattern getInstance() {
//        if (this.singletonPattern == null) {
//            this.singletonPattern = new SingletonPattern();
//        }
//        return this.singletonPattern;
//    }
    public synchronized static SingletonPattern getInstance() {
        return singletonPattern;
    }
}
