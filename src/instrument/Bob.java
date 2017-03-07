package instrument;

import java.util.Random;

/**
 * Created by Taras on 06.03.2017.
 */
public class Bob implements Instrumentalist {
    private Random random = new Random();
    private Sax sax = new Sax();
    private Guitar guitar = new Guitar();
    private Drums drums = new Drums();


    @Override
    public void performance() {
        System.out.println("Bob is playing on");
        int randomInstrument = random.nextInt(3);
        if(randomInstrument == 0){
            sax.play();
        }
        else if(randomInstrument == 1){
            guitar.play();
        }
        else if(randomInstrument == 2){
            drums.play();
        }
    }
}
