package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactureTest {
    
    @Test
    public void testAjouterLigne() {
        Facture facture = new Facture("Client Test");
        facture.ajouterLigne("Produit A", 10.0, 2);
        
        assertEquals(1, facture.getLignes().size());
        assertEquals("Produit A", facture.getLignes().get(0).getProduit());
    }
    
    @Test
    public void testCalculerTotal() {
        Facture facture = new Facture("Client Test");
        facture.ajouterLigne("Produit A", 10.0, 2); // 20
        facture.ajouterLigne("Produit B", 5.0, 3);  // 15
        
        assertEquals(35.0, facture.calculerTotal(), 0.001);
    }
    
    @Test
    public void testGetClient() {
        Facture facture = new Facture("Client Test");
        assertEquals("Client Test", facture.getClient());
    }
    
    @Test
    public void testLigneFactureSousTotal() {
        Facture.LigneFacture ligne = new Facture.LigneFacture("Produit C", 7.5, 4);
        assertEquals(30.0, ligne.getSousTotal(), 0.001);
    }
}
