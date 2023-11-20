package tn.esprit.gestionZoo.entities;

import tn.esprit.gestionZoo.entities.Enum.Food;
import tn.esprit.gestionZoo.exception.InvalidAgeException;
import tn.esprit.gestionZoo.interfaces.Omnivore;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }


    @Override
    public void eatMeat(Food meat) {
        System.out.println("Terrestrial is eating " + meat);
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("Terrestrial is eating " + plant);
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("Terrestrial is eating " + food);
    }
}
