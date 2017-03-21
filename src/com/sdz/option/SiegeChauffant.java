package com.sdz.option;

import java.io.Serializable;

public class SiegeChauffant implements Option , Serializable {

    @Override
    public Double getPrix(){
        return 562.9d;
    }

    @Override
    public String toString() {
        return "Siege chauffant ("+this.getPrix()+ "€)";
    }

}
