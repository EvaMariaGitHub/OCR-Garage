package com.sdz;

import com.sdz.serialisation.FileGarage;
import com.sdz.vehicule.Vehicule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Garage implements Serializable {
    private List<Vehicule> voitures = new ArrayList<>();

    public Garage () {
        voitures = FileGarage.deserialize();
    }

    public void addVoiture(Vehicule voiture) {FileGarage.serialize(voiture);
    }

    @Override
    public String toString() {
        String str;
        str = "*********************************************\n";
        str += "*        Garage OpenClassRooms              * \n";
        str += "********************************************* \n";
        for (Vehicule voiture : voitures) {
            str+= "+ "+ voiture + "\n";
        }
        return str;
    }
}
