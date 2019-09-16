package com.zzx.lsth.demo;

/**
 * @ClassName Client
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 15:46
 * Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
//        Soldier sanMao = new Soldier();
//        sanMao.killEnemy(new Rifile());
        Snipper snipper = new Snipper();
        Rifile rifile = new Rifile();
        snipper.killEnemy(new G3());
//        snipper.killEnemy((G3) rifile);// 报错，因为父类出现的地方，子类可以出现，子类出现的地方，父类未必可以出现（子类实现了父类的方法，又有自己的个性）
    }
}
