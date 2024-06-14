package com.sparklingcup;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SparklingCupTest {
    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        SparklingCup app = new SparklingCup(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
}