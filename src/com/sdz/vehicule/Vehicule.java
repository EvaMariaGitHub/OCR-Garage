package com.sdz.vehicule;

import com.sdz.moteur.Moteur;
import com.sdz.option.Option;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Serializable{
    private Double prix;
    private List<Option> options = new ArrayList<>();
    private Moteur moteur;
    protected String nom;
    protected Marque nomMarque;


    public Vehicule () {
        prix = 0d;
    }

    @Override
    public String toString() {
        String str = "Voiture "+ getNomMarque()+" : "+nom+" Moteur "+moteur+ " ";
        str += getOptions();
        str += " d'une valeur totale de "+ getPrix()+"€";
        return str;
    }

    public void addOption(Option opt) {
        options.add(opt);
    }

    public void setMoteur (Moteur moteur) { this.moteur = moteur; }

    private Marque getNomMarque(){
        return this.nomMarque;
    }

    private List<Option> getOptions() {
        return this.options;
    }

    private Double getPrix() {
        prix = moteur.getPrix();
        for (Option option : options) {
            prix += option.getPrix();
        }
        return this.prix;
    }
}
