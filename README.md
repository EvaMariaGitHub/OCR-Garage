# OCR-Garage

Exercises
Instructions

Back

Bienvenue dans cette activité de correction par les pairs.

Vous allez mettre en pratique une bonne partie de ce que vous avez appris dans la partie 1 et 2 de ce cours Java :

    création de classes;
    héritage;
    packages;
    énumération;
    générique;
    fichiers.


Voici un diagramme de classes vous représentant l’exercice :

Diagramme UML de l'exercice
![Alt text](/relative/path/to/img.jpg?raw=true "Optional Title")

Vous l’aurez compris, vous allez devoir créer un garage, mais vous allez devoir aussi le sauvegarder dans un fichier… Le but étant qu’à chaque fois que vous ajoutez un nouveau véhicule dans votre garage, celui-ci se sauvegarde automatiquement dans un fichier. Il faudra aussi automatiquement charger le garage lors de son instanciation.

 

Étant d’un naturel magnanime, je vous donne une classe de test pour votre programme :

public class Main {
    public static void main(String[] args) {
   	 Garage garage = new Garage();   
   	 System.out.println(garage);
   	 
   	 Vehicule lag1 = new Lagouna();
   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
   	 lag1.addOption(new GPS());
   	 lag1.addOption(new SiegeChauffant());
   	 lag1.addOption(new VitreElectrique());
   	 garage.addVoiture(lag1);
   		 
   	 Vehicule A300B_2 = new A300B();
   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
   	 A300B_2.addOption(new Climatisation());
   	 A300B_2.addOption(new BarreDeToit());
   	 A300B_2.addOption(new SiegeChauffant());
   	 garage.addVoiture(A300B_2);
   	 
   	 Vehicule d4_1 = new D4();
   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
   	 d4_1.addOption(new BarreDeToit());
   	 d4_1.addOption(new Climatisation());
   	 d4_1.addOption(new GPS());
   	 garage.addVoiture(d4_1);   	 
   	 
   	 Vehicule lag2 = new Lagouna();
   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
   	 garage.addVoiture(lag2);
   	 
   	 Vehicule A300B_1 = new A300B();
   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
   	 A300B_1.addOption(new VitreElectrique());
   	 A300B_1.addOption(new BarreDeToit());
   	 garage.addVoiture(A300B_1);
   	 
   	 Vehicule d4_2 = new D4();
   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
   	 d4_2.addOption(new SiegeChauffant());
   	 d4_2.addOption(new BarreDeToit());
   	 d4_2.addOption(new Climatisation());
   	 d4_2.addOption(new GPS());
   	 d4_2.addOption(new VitreElectrique());
   	 garage.addVoiture(d4_2);   			 
    }
}

 

 

Et pour que vous ayez une idée de ce que ce programme pourrait vous donner, voici deux screenshots, celui-ci lors du premier lancement de cette classe de test :

Premier screenshot

 

Et celui-là après le deuxième lancement (vous constaterez que mon garage n’est plus vide à ce moment-là) :

Second screenshot

 

C'est à vous !

 
