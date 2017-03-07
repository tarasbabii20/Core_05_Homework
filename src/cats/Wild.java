package cats;

/**
 * Created by Taras on 05.03.2017.
 */
public class Wild extends Cats{

    private String genus;

    public Wild(String phylum, String animalClass, String family, String order, String genus) {
        super(phylum, animalClass, family, order);
        this.genus = genus;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public void hunting(){
        System.out.println("hunting");
    }

    @Override
    public void voice() {
        System.out.println("roar");
    }
}
