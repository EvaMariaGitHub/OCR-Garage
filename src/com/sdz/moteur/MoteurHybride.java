package com.sdz.moteur;

public class MoteurHybride extends Moteur {

    public MoteurHybride (String cylindre, Double prix) {
        super(cylindre, prix);
        this.type = TypeMoteur.HYBRIDE;
    }
}
