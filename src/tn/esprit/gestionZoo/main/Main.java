package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", -2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(tn.esprit.gestionZoo.entities.Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());
//
        System.out.println();
        System.out.println("*********************************************************************");
        System.out.println();


     //   Aquatic aquatic = new Aquatic("Fish", "7out", 1, true, "b7ar");


        Terrestrial terrestrial = new Terrestrial("eagle", "3asfour", 2, true, 2);
        Dolphin dolphin = new Dolphin("dolphin", "aqua", 2, true, "b7ar", 2.2f);
        Dolphin dolphin1 = new Dolphin("dolphin1", "aqua1", 2, true, "b7ar", 2.2f);
        Dolphin dolphin2 = new Dolphin("dolphin2", "aqua2", 2, true, "b7ar", 2.2f);
        Dolphin dolphin3 = new Dolphin("dolphin3", "aqua2", 2, true, "b7ar", 2.2f);
        Dolphin dolphin4 = new Dolphin("dolphin4", "aqua2", 2, true, "b7ar", 2.2f);

        Penguin penguin = new Penguin("penguin", "betri9", 2, true, "b7ar", 5.9f);
        Penguin penguin1 = new Penguin("penguin1", "betri9", 2, true, "b7ar", 5.9f);
        Penguin penguin2 = new Penguin("penguin2", "betri9", 2, true, "b7ar", 5.9f);
        Penguin penguin3 = new Penguin("penguin3", "betri9", 2, true, "b7ar", 5.9f);
        Penguin penguin4 = new Penguin("penguin4", "betri9", 2, true, "b7ar", 5.9f);

        // TODO 27
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(dolphin3);
        myZoo.addAquaticAnimal(dolphin4);
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.addAquaticAnimal(penguin3);
        myZoo.addAquaticAnimal(penguin4);

        // TODO 27

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }


     //   System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);



    //    aquatic.swim();
        dolphin.swim();
        penguin.swim();


    }
}