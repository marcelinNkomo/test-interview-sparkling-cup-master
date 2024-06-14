package com.sparklingcup.items;

import com.sparklingcup.CustomItem;
import com.sparklingcup.Exceptions.QualityException;

public class AgedBrie extends CustomItem {

    public AgedBrie(String name, int sellIn, int quality) throws QualityException {
        super(name, sellIn, quality);
    }

    @Override
    public void process() {
        improveQuality();

        updateSellIn();

        if (sellIn < 0) {
            improveQuality();
        }
    }
}
