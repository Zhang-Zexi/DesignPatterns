package com.zzx.strategy;

/**
 * @ClassName BackDoor
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 16:38
 * Version 1.0
 **/
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
