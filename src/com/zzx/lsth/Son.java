package com.zzx.lsth;

import java.util.HashMap;
import java.util.Map;

import java.util.Collection;

/**
 * @ClassName Son
 * @Description
 * @Author zhangzx
 * @Date 2019/9/5 15:30
 * Version 1.0
 **/
public class Son extends Father{
    public Collection doSomething(HashMap map) {
        System.out.println("子类被执行...");
        return map.values();
    }
}
