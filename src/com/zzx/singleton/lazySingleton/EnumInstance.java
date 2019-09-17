package com.zzx.singleton.lazySingleton;

/**
 * @ClassName EnumInstance
 * @Description
 * @Author zhangzx
 * @Date 2019/9/17 17:18
 * Version 1.0
 **/
public enum EnumInstance {
    INSTANCE {
        protected void printTest() {
            System.out.println("Geely Print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
