package com.zzx.kaibi;

import junit.framework.TestCase;

/**
 * @ClassName NovelBookTest
 * @Description
 * @Author zhangzx
 * @Date 2019/9/6 17:49
 * Version 1.0
 **/
public class NovelBookTest extends TestCase {

    private String name = "平凡的世界";
    private int price = 6000;
    private String author = "路遥";

    private IBook novelBook = new NovelBook(name, price, author);

    public void testGetPrice() {
        super.assertEquals(this.price, this.novelBook.getPrice());
    }
}
