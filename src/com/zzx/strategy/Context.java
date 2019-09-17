package com.zzx.strategy;

/**
 * @ClassName Context
 * @Description 锦囊
 * @Author zhangzx
 * @Date 2019/9/16 16:40
 * Version 1.0
 **/
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
