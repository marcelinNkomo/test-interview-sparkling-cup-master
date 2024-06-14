package com.sparklingcup;

public class SparklingCup {
    Item[] items;

    public SparklingCup(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.process();
        }
    }
}