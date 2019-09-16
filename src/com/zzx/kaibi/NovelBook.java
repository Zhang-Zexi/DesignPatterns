package com.zzx.kaibi;

/**
 * @ClassName NovelBook
 * @Description
 * @Author zhangzx
 * @Date 2019/9/6 17:12
 * Version 1.0
 **/
public class NovelBook implements IBook {

    private String name;

    private int price;

    private String author;

    public NovelBook(String _name, int _price, String _author) {
        this.name = _name;
        this.price = _price;
        this.author = _author;
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
