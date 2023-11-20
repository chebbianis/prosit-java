package tn.esprit.gestionZoo.entities;

import tn.esprit.gestionZoo.exception.InvalidAgeException;

public class Dolphin extends Aquatic {

    private float swimmingSpeed;

    public Dolphin() {
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed:" + swimmingSpeed;
    }
}
