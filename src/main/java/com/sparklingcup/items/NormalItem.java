package com.sparklingcup.items;

import com.sparklingcup.CustomItem;
import com.sparklingcup.Exceptions.QualityException;

public class NormalItem extends CustomItem {
    public NormalItem(String name, int sellIn, int quality) throws QualityException {
        super(name, sellIn, quality);
    }

    @Override
    public void process() {
        degradeQuality(1);

        updateSellIn();

        if (sellIn < 0) {
            degradeQuality(1);
        }
    }
}
