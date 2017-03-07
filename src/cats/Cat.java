package cats;

/**
 * Created by Taras on 05.03.2017.
 */
public class Cat extends Domestic{

    private String species;

    public Cat(String phylum, String animalClass, String family, String order, String genus, String species) {
        super(phylum, animalClass, family, order, genus);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
