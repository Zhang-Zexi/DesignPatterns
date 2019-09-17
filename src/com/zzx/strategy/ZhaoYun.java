package com.zzx.strategy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @ClassName ZhaoYun
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 16:43
 * Version 1.0
 **/
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;
        System.out.println("-----------刚到吴国拆第一个-----------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");

        System.out.println("-----------乐不思蜀，拆第二个---------");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");

        System.out.println("-----------孙权追击，第三个------------------");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
