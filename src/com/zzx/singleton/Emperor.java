package com.zzx.singleton;

/**
 * @ClassName Emperor
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 17:05
 * Version 1.0
 **/
public class Emperor {
    private static Emperor emperor = null;

    private Emperor() {
    }

    public static Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo() {
        System.out.println("我是皇帝XXX......");
    }
}
