package com.zzx.kaibi;

/**
 * @ClassName ComputerBook
 * @Description
 * @Author zhangzx
 * @Date 2019/9/11 9:42
 * Version 1.0
 **/
public class ComputerBook implements IComputerBook {

    private String name;
    private String scope;
    private String author;
    private int price;

    public ComputerBook(String _name, int _price, String _author, String _scope) {
        this.name = _name;
        this.price = _price;
        this.author = _author;
        this.scope = _scope;
    }
    @Override
    public String getScope() {
        return this.scope;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
