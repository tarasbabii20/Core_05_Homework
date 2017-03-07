package car;

import java.util.Random;

/**
 * Created by Taras on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Car car = new Car("mazda", "black", 220, new Helm(34, "yellow"),
                new Wheel(21, 40), new Body("steel", "sedan"));

        car.getHelm().changeDiameter();
        car.getHelm().changeColor();
        car.getWheel().changeSize();
        car.getWheel().changeWeight();
        car.getBody().changeMaterial();
        car.getBody().changeType();
        car.changeColor();
        car.changeMaxSpeed();

    }
}
