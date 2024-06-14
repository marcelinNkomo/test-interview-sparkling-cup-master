package com.sparklingcup.items;

import com.sparklingcup.Exceptions.QualityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackstagePassesTest {

    BackstagePasses backstagePasses;

    @Test
    void process_diminueLeNbJoursRestant_et_augmenteLaQualite() throws QualityException {
        // Given
        backstagePasses = new BackstagePasses("test-name", 12, 20);

        // When
        backstagePasses.process();

        // Then
        assertEquals(11, backstagePasses.sellIn);
        assertEquals(21, backstagePasses.quality);
    }

    @Test
    void process_augmente2FoisPlusLaQualite_quandIlReste10JoursOuMoinsMaisPlusDe5jours() throws QualityException {
        // Given
        backstagePasses = new BackstagePasses("BackstagePasses-name",10, 20);

        // When
        backstagePasses.process();

        // Then
        assertEquals(9, backstagePasses.sellIn);
        assertEquals(22, backstagePasses.quality);
    }


    @Test
    void process_augmente3FoisPlusLaQualite_quandIlReste5JoursOuMoins() throws QualityException {
        // Given
        backstagePasses = new BackstagePasses("BackstagePasses-name",5, 20);

        // When
        backstagePasses.process();

        // Then
        assertEquals(4, backstagePasses.sellIn);
        assertEquals(23, backstagePasses.quality);
    }


    @Test
    void process_metLaQualiteAZeroSiLeDelaiEstDepasse() throws QualityException {
        // Given
        backstagePasses = new BackstagePasses("BackstagePasses-name",-1, 20);

        // When
        backstagePasses.process();

        // Then
        assertEquals(-2, backstagePasses.sellIn);
        assertEquals(0, backstagePasses.quality);
    }
}