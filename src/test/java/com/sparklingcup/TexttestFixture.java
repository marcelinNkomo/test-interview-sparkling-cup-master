package com.sparklingcup;

import com.sparklingcup.Exceptions.QualityException;
import com.sparklingcup.items.AgedBrie;
import com.sparklingcup.items.BackstagePasses;
import com.sparklingcup.items.Conjured;
import com.sparklingcup.items.NormalItem;
import com.sparklingcup.items.Sulfuras;

public class TextTestFixture {
    public static void main(String[] args) throws QualityException {
        System.out.println("OMGHAI!");

        Item[] items = new Item[]{
                /*
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new NormalItem("Conjured Mana Cake", 3, 6)
                */
                new NormalItem("+5 Dexterity Vest", 10, 20), //
                new AgedBrie("Aged Brie",2, 0), //
                new NormalItem("Elixir of the Mongoose", 5, 7), //
                new Sulfuras("Sulfuras, Hand of Ragnaros", 0), //
                new Sulfuras("Sulfuras, Hand of Ragnaros",-1),
                new BackstagePasses("Backstage passes to a TAFKAL80ETC concert",15, 20),
                new BackstagePasses("Backstage passes to a TAFKAL80ETC concert",10, 49),
                new BackstagePasses("Backstage passes to a TAFKAL80ETC concert",5, 49),
                // conjured should probably work better
                new Conjured("Conjured Mana Cake", 3, 6)
        };

        SparklingCup app = new SparklingCup(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
}
