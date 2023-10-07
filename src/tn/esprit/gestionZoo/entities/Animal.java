package tn.esprit.gestionZoo.entities;

public class Animal {

    private String family, name;
    private int age;
    private boolean isMammal;


    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if (age >= 0)
            this.age = age;
        else
            System.out.println("age doit etre positive");
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionZoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
        else
            System.out.println("age doit etre positive");
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }
}
