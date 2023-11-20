package tn.esprit.gestionZoo.entities;


import tn.esprit.gestionZoo.entities.Enum.Food;
import tn.esprit.gestionZoo.exception.InvalidAgeException;
import tn.esprit.gestionZoo.interfaces.Carnivore;

public abstract class Aquatic extends Animal implements Carnivore<Food> {

    protected String habitat;

    public Aquatic() {
    }

    @Override
    public void eatMeat(Food meat) {

        System.out.println("Aquatic is eating " + meat);
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    //TODO 31

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }
}
