package com.example;

public class LigneBonLivraison {
    private int idLigneBonLivraison;
    private int idBonLivraison;
    private String libelle;
    private int quantite;

    public LigneBonLivraison(int idBonLivraison, String libelle, int quantite) {
        if (libelle == null || libelle.isEmpty() || quantite < 0) {
            throw new IllegalArgumentException("Libellé vide ou quantité invalide");
        }
        this.idBonLivraison = idBonLivraison;
        this.libelle = libelle;
        this.quantite = quantite;
    }

    public int getIdLigneBonLivraison() {
        return idLigneBonLivraison;
    }

    public void setIdLigneBonLivraison(int idLigneBonLivraison) {
        this.idLigneBonLivraison = idLigneBonLivraison;
    }

    public int getIdBonLivraison() {
        return idBonLivraison;
    }

    public void setIdBonLivraison(int idBonLivraison) {
        this.idBonLivraison = idBonLivraison;
    }

    public String getLibelle() {
        return libelle;
    }

    public boolean updateLibelle(String newLibelle) {
        if (newLibelle == null || newLibelle.isEmpty()) {
            return false;
        }
        this.libelle = newLibelle;
        return true;
    }

    public int getQuantite() {
        return quantite;
    }

    public boolean updateQuantite(int newQuantite) {
        if (
