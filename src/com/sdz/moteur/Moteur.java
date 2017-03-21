package com.sdz.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable{
    protected TypeMoteur type;
    private String cylindre;
    private Double prix;

    public Moteur (String cylindre, Double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return type+" "+cylindre+" ("+prix+"€)";
    }

    public Double getPrix(){
        return prix;
    }

}
