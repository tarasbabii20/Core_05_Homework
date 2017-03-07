package cats;

/**
 * Created by Taras on 05.03.2017.
 */
public abstract class Cats extends Animal {

    private String order;

    public Cats(String phylum, String animalClass, String family, String order) {
        super(phylum, animalClass, family);
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void breath() {
        System.out.println("breath");
    }

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void reproduction() {
        System.out.println("reproduction");
    }

    public abstract void voice();


}
