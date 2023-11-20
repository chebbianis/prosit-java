package tn.esprit.gestionZoo.entities;

import tn.esprit.gestionZoo.exception.ZooFullException;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private int nbrAquatics;
    private Aquatic[] aquaticAnimals;


    public int getNbrAquatics() {
        return nbrAquatics;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquatics = nbrAquatics;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        aquaticAnimals[nbrAquatics] = aquatic;
        nbrAquatics++;
    }


    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Aquatic[10];
        if (!name.isEmpty())
            this.name = name;
        else
            System.out.println("nom ne peut pas etre vide ! ");
        this.city = city;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }


    public void addAnimal(Animal animal) throws ZooFullException {
        if (searchAnimal(animal) != -1 && isZooFull()) {
            throw new ZooFullException("Cannot add animal. Zoo is full.");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else
            System.out.println("nom ne peut pas etre vide ! ");
    }

    //TODO 29
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxDepth < penguin.getSwimmingDepth())
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }

    //TODO30

    public void displayNumberOfAquaticsByType() {
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Le Zoo " + name + " contient " + nbrDolphins + " dauphins et " + nbrPenguins + " pingouins");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }
}
