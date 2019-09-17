package com.zzx.singleton;

/**
 * @ClassName Minister
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 17:09
 * Version 1.0
 **/
@SuppressWarnings("all")
public class Minister {

    public static void main(String[] args) {
        // 第一天
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();

        // 第二天
        Emperor emperor2 = Emperor.getInstance();
        Emperor.emperorInfo();

        // 第三天
        Emperor emperor3 = Emperor.getInstance();
        emperor2.emperorInfo();
    }
}
