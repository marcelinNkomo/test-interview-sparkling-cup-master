package com.sparklingcup.items;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SulfurasTest {

    private Sulfuras sulfuras;

    @BeforeEach
    void setUp() {
        sulfuras = new Sulfuras("Sulfuras-name", 0);
    }

    @Test
    void process_neChangeAucuneValeur() {
        // Given
        Sulfuras spySulfuras = Mockito.spy(sulfuras);

        // When
        sulfuras.process();

        // Then
        Mockito.verifyNoMoreInteractions(spySulfuras);
        Assertions.assertEquals(0, sulfuras.sellIn);
        Assertions.assertEquals(80, sulfuras.quality);
    }

}