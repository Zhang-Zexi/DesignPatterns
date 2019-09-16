package com.zzx.lsth;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Father
 * @Description
 * @Author zhangzx
 * @Date 2019/9/5 15:29
 * Version 1.0
 **/
public class Father {
    public Collection doSomething(Map map) {
        System.out.println("父类被执行...");
        return map.values();
    }
}
