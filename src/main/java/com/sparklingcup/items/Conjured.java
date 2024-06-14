package com.sparklingcup.items;

import com.sparklingcup.CustomItem;
import com.sparklingcup.Exceptions.QualityException;

public class Conjured extends CustomItem {

    public Conjured(String name, int sellIn, int quality) throws QualityException {
        super(name, sellIn, quality);
    }

    @Override
    public void process() {
        degradeQuality(2);

        updateSellIn();

        if (sellIn < 0) {
            degradeQuality(2);
        }
    }
}
