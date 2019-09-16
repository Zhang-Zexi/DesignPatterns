package com.zzx.dmt;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GroupLeader
 * @Description
 * @Author zhangzx
 * @Date 2019/9/6 16:37
 * Version 1.0
 **/
public class GroupLeader {

    public void countGrils() {
        List<Girl> listGirls = new ArrayList<Girl>();
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        System.out.println("女生数量：" + listGirls.size());
    }
}
