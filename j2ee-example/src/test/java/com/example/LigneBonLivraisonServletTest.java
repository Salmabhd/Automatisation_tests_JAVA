package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LigneBonLivraisonTest {

    private LigneBonLivraison ligne;

    @BeforeEach
    void setUp() {
        ligne = new LigneBonLivraison(1, "Produit A", 10);
    }

    @Test
    void testLigneCreation() {
        assertEquals(1, ligne.getIdBonLivraison());
        assertEquals("Produit A", ligne.getLibelle());
        assertEquals(10, ligne.getQuantite());
    }

    @Test
    void testInvalidLigneCreation() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new LigneBonLivraison(1, "", 10);
        });
        assertEquals("Libellé vide ou quantité invalide", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            new LigneBonLivraison(1, "Produit B", -5);
        });
        assertEquals("Libellé vide ou quantité invalide", exception.getMessage());
    }

    @Test
    void testUpdateLibelle() {
        assertTrue(ligne.updateLibelle("Produit C"));
        assertEquals("Produit C", ligne.getLibelle());

        assertFalse(ligne.updateLibelle(""));
        assertFalse(ligne.updateLibelle(null));
    }

    @Test
    void testUpdateQuantite() {
        assertTrue(ligne.updateQuantite(25));
        assertEquals(25, ligne.getQuantite());

        assertFalse(ligne.updateQuantite(-3));
    }
}
