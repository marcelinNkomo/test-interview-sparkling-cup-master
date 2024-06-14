package com.sparklingcup.items;

import com.sparklingcup.Exceptions.QualityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalItemTest {

    NormalItem normalItem;

    @Test
    void process_degradeLaQualite_et_diminueLeNbJours() throws QualityException {
        // Given
        normalItem = new NormalItem("test-name", 3, 20 );

        //When
        normalItem.process();

        // Then
        assertEquals(2, normalItem.sellIn);
        assertEquals(19, normalItem.quality);
    }

    @Test
    void process_degradeLaQualite2FoisPlusViteSiLaDateEstDepassee() throws QualityException {
        // Given
        normalItem = new NormalItem("test-name", -2, 20 );

        //When
        normalItem.process();

        // Then
        assertEquals(-3, normalItem.sellIn);
        assertEquals(18, normalItem.quality);
    }
}