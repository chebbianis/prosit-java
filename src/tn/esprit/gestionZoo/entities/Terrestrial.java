package tn.esprit.gestionZoo.entities;

import tn.esprit.gestionZoo.exception.InvalidAgeException;

public final class Terrestrial extends Animal {

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
}
