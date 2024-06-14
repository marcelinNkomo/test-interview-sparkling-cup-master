package com.sparklingcup;

import com.sparklingcup.Exceptions.QualityException;

public class CustomItem extends Item {

    public CustomItem(String name, int sellIn, int quality) throws QualityException {
        super(name, sellIn, quality);

        if (quality > 50 || quality < 0) {
            throw new QualityException();
        }
    }

    protected void improveQuality() {
        if (quality < 50) {
            quality += 1;
        }
    }

    protected void degradeQuality(int times) {
        if (quality > 0 && quality >= times) {
            quality -= times;
        }else{
            quality = 0;
        }
    }

    protected void updateSellIn() {
        sellIn --;
    }
}
