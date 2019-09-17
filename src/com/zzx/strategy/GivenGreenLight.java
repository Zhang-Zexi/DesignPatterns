package com.zzx.strategy;

/**
 * @ClassName GivenGreenLight
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 16:39
 * Version 1.0
 **/
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
