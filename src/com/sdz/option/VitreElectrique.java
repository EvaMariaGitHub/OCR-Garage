package com.sdz.option;

import java.io.Serializable;

public class VitreElectrique implements Option , Serializable {

    @Override
    public Double getPrix(){
        return 212.35d;
    }

    @Override
    public String toString() {
        return "Vitre electrique ("+this.getPrix()+ "€)";
    }
}
