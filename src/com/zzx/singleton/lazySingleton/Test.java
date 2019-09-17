package com.zzx.singleton.lazySingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/9/16 17:48
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program end");

//        HungrySingleton instance = HungrySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
////        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance == newInstance);

//        Class objectClass = HungrySingleton.class;
//        Class objectClass = StaticInnerClassSingleton.class;
//        Class objectClass = LazySingleton.class;
//        Class objectClass = EnumInstance.class;
////
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);//添加权限
//        EnumInstance instance = (EnumInstance) constructor.newInstance("Geely", 666);
//
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();

//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();

//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        EnumInstance instance = EnumInstance.getInstance();
        instance.printTest();

    }
}
