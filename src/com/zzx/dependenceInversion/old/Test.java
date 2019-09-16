package com.zzx.dependenceInversion.old;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/9/4 17:18
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studeyPythonCourse();
        geely.studeyPythonCourse();
    }
}
