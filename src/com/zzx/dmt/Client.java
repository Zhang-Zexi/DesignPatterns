package com.zzx.dmt;

/**
 * @ClassName Client
 * @Description
 * @Author zhangzx
 * @Date 2019/9/6 16:40
 * Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader());
    }
}
