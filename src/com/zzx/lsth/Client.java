package com.zzx.lsth;

import java.util.HashMap;

/**
 * @ClassName Client
 * @Description
 * @Author zhangzx
 * @Date 2019/9/5 15:31
 * Version 1.0
 **/
public class Client {
    public static void invoker() {
        // 父类存在的地方，子类就能够存在
//        Father f = new Father();
        Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {
        invoker();
    }
}
