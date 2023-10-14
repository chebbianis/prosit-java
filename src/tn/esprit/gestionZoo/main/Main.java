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


        Aquatic aquatic = new Aquatic("Fish", "7out", 1, true, "b7ar");


        Terrestrial terrestrial = new Terrestrial("eagle", "3asfour", 2, true, 2);
        Dolphin dolphin = new Dolphin("dolphin", "aqua", 2, true, "b7ar", 2.2f);
        Penguin penguin = new Penguin("penguin", "betri9", 2, true, "b7ar", 5.9f);


        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);



        aquatic.swim();
        dolphin.swim();
        penguin.swim();


    }
}