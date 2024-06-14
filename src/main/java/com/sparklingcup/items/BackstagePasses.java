package com.sparklingcup.items;

import com.sparklingcup.CustomItem;
import com.sparklingcup.Exceptions.QualityException;


public class BackstagePasses extends CustomItem {

    public BackstagePasses(String name, int sellIn, int quality) throws QualityException {
        super(name, sellIn, quality);
    }

    @Override
    public void process() {
        improveQuality();

        if (sellIn < 11) {
            improveQuality();
        }

        if (sellIn < 6) {
            improveQuality();
        }

        updateSellIn();

        if (sellIn < 0) {
            quality = 0;
        }
    }
}
