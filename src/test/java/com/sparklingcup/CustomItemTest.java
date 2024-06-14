package com.sparklingcup;

import com.sparklingcup.Exceptions.QualityException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomItemTest {

    @Test
    void laQualiteNePeutEtreNegative() {
        Assertions.assertThrowsExactly(QualityException.class, () -> new CustomItem("fake-test-name", 1, -1));
    }

    @Test
    void laQualiteNePeutEtreSuperieurA_50() {
        Assertions.assertThrowsExactly(QualityException.class, () -> new CustomItem("test-name", 1, 51));
    }

    @Test
    void improveQuality_doitAugmenterLaQualiteDe_1_siLaQualiteEstInferieurA_50() throws QualityException {
        // Given
        CustomItem customItem = new CustomItem("test-name", 5, 30);

        // When
        customItem.improveQuality();

        // Then
        Assertions.assertEquals(31, customItem.quality);
    }

    @Test
    void degradeQuality_doitDegraderLaQualiteDuNombreDefoisSouhaite_siLaQualiteSuperieureA_nbFoisSouhaite() throws QualityException {
        // Given
        CustomItem customItem = new CustomItem("test-name", 5, 3);

        // When
        customItem.degradeQuality(2);

        // Then
        Assertions.assertEquals(1, customItem.quality);
    }

    @Test
    void degradeQuality_doitMettreLaQualiteA_0_siLaQualiteEstInferieurOuEgaleAu_nbFoisSouhaite() throws QualityException {
        // Given
        CustomItem customItem = new CustomItem("test-name", 5, 3);

        // When
        customItem.degradeQuality(4);

        // Then
        Assertions.assertEquals(0, customItem.quality);
    }

    @Test
    void updateSellIn_doitMAJ_leNbJoursRestant() throws QualityException {
        // Given
        CustomItem customItem = new CustomItem("name", 5, 3);

        // When
        customItem.updateSellIn();

        // Then
        Assertions.assertEquals(4, customItem.sellIn);
    }
}