package com.sparklingcup.items;

import com.sparklingcup.Exceptions.QualityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConjuredTest {
    Conjured conjured;
    @Test
    void process_degrade2FoisPlusLaQualiteQunObjectNormal_et_diminueLeNbJours() throws QualityException {
        // Given
        conjured = new Conjured( "Conjured-name", 3, 20 );

        //When
        conjured.process();

        // Then
        assertEquals(2, conjured.sellIn);
        assertEquals(18, conjured.quality);
    }

    @Test
    void process_degradeLaQualite2FoisPlusViteSiLaDateEstDepasseeQunObjectNormal() throws QualityException {
        // Given
        conjured = new Conjured("Conjured-name",-2, 20 );

        //When
        conjured.process();

        // Then
        assertEquals(-3, conjured.sellIn);
        assertEquals(16, conjured.quality);
    }
}