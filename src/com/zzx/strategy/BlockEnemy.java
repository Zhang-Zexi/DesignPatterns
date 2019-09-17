package com.zzx.strategy;

/**
 * @ClassName BlockEnemy
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 16:39
 * Version 1.0
 **/
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
