package com.sdz.serialisation;

import com.sdz.vehicule.Vehicule;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileGarage {
    private static String FILE = "vehicules.ser";
    private static Path PATH_FILE = Paths.get(FILE);
    private static List<Vehicule> vehicules = new ArrayList<>();

    public static List<Vehicule> deserialize() {
        try (
                InputStream is = Files.newInputStream(PATH_FILE);
                ObjectInputStream in = new ObjectInputStream(is))
        {
            vehicules =  (List<Vehicule>) in.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFileException e) {
            Exception a = new Exception("Aucune voiture sauvegardée ! ");
            System.out.println("\u001B[31m " + a.getMessage() + "\033[0m");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return vehicules;
    }

    public static void serialize(Vehicule voiture) {
        vehicules.add(voiture);
        try (
                OutputStream os = Files.newOutputStream(PATH_FILE);
                ObjectOutputStream out = new ObjectOutputStream(os))
        {
            out.writeObject(vehicules);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

