package instrument;

/**
 * Created by Taras on 06.03.2017.
 */
public class Steve implements Instrumentalist {

    private Sax sax = new Sax();
    private Guitar guitar = new Guitar();
    private Drums drums = new Drums();

    @Override
    public void performance() {
        System.out.println("Steve is playing on");
        sax.play();
        guitar.play();
        drums.play();
    }
}
