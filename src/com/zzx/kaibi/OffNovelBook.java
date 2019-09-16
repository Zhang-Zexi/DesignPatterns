package com.zzx.kaibi;

/**
 * @ClassName OffNovelBook
 * @Description
 * @Author zhangzx
 * @Date 2019/9/6 17:40
 * Version 1.0
 **/
public class OffNovelBook extends NovelBook {

    public OffNovelBook(String _name, int _price, String _author) {
        super(_name, _price, _author);
    }

    @Override
    public int getPrice() {
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if (selfPrice > 4000) {
            offPrice = selfPrice  * 90 / 100;
        } else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
