package tn.esprit.gestionZoo.entities;

import tn.esprit.gestionZoo.exception.InvalidAgeException;

public class Penguin extends Aquatic {

    private float swimmingDepth;

    public Penguin() {
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public void swim() {
        System.out.println("this penguin is swimming");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }
}
