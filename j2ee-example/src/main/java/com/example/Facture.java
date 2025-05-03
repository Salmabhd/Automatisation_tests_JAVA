package com.example;

import java.util.ArrayList;
import java.util.List;

public class Facture {
    private String client;
    private List<LigneFacture> lignes;
    
    public Facture(String client) {
        this.client = client;
        this.lignes = new ArrayList<>();
    }
    
    public void ajouterLigne(String produit, double prix, int quantite) {
        lignes.add(new LigneFacture(produit, prix, quantite));
    }
    
    public double calculerTotal() {
        return lignes.stream()
                   .mapToDouble(LigneFacture::getSousTotal)
                   .sum();
    }
    
    public String getClient() {
        return client;
    }
    
    public List<LigneFacture> getLignes() {
        return new ArrayList<>(lignes); // Retourne une copie pour l'immutabilité
    }
    
    // Classe interne pour représenter une ligne de facture
    public static class LigneFacture {
        private String produit;
        private double prix;
        private int quantite;
        
        public LigneFacture(String produit, double prix, int quantite) {
            this.produit = produit;
            this.prix = prix;
            this.quantite = quantite;
        }
        
        public double getSousTotal() {
            return prix * quantite;
        }
        
        public String getProduit() {
            return produit;
        }
        
        public double getPrix() {
            return prix;
        }
        
        public int getQuantite() {
            return quantite;
        }
    }
}