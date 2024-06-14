package com.sparklingcup.items;

import com.sparklingcup.Exceptions.QualityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {

    AgedBrie agedBrie;
    
    @Test
    void process_augmenteLaQualite_et_diminueLeNbJours() throws QualityException {
        // Given
        agedBrie = new AgedBrie("test-name",3, 20 );

        //When
        agedBrie.process();

        // Then
        assertEquals(2, agedBrie.sellIn);
        assertEquals(21, agedBrie.quality);
    }

    @Test
    void process_augmenteLaQualite2FoisPlusViteSiLaDateEstDepassee() throws QualityException {
        // Given
        agedBrie = new AgedBrie("test-name",-2, 20 );

        //When
        agedBrie.process();

        // Then
        assertEquals(-3, agedBrie.sellIn);
        assertEquals(22, agedBrie.quality);
    }

}