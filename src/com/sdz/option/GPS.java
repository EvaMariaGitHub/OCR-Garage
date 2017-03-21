package com.sdz.option;

import java.io.Serializable;

public class GPS implements Option , Serializable {

    @Override
    public Double getPrix() {return 113.5d;}

    @Override
    public String toString() {return "GPS ("+this.getPrix()+ "€)";}
}
