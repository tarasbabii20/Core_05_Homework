package cats;

/**
 * Created by Taras on 05.03.2017.
 */
public abstract class Animal {

    private String phylum;
    private String animalClass;
    private String family;

    public Animal(String phylum, String animalClass, String family) {
        this.phylum = phylum;
        this.animalClass = animalClass;
        this.family = family;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public abstract void eat();

    public abstract void breath();

    public abstract void move();

    public abstract void reproduction();


}
