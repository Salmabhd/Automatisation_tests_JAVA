package com.example;

import org.junit.jupiter.api.Test;

public class BonLivraisonDAOTest {

    @Test
    public void testAfficherTousLesBons() {
        BonLivraisonDAO dao = new BonLivraisonDAO();
        System.out.println("Test lancé");
        dao.afficherTousLesBons(); // Vérifie manuellement dans la console pour commencer
    }
}
