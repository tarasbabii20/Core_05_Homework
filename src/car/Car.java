package car;

import java.util.Random;

/**
 * Created by Taras on 06.03.2017.
 */
public class Car {

    private Random random = new Random();
    private String brand;
    private String color;
    private int maxSpeed;
    private Helm helm;
    private Wheel wheel;
    private Body body;

    public Car(String brand, String color, int maxSpeed, Helm helm, Wheel wheel, Body body) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.helm = helm;
        this.wheel = wheel;
        this.body = body;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void changeMaxSpeed(){
        int randomOperation = random.nextInt(2);
        while (true) {
            int changeSpeed = random.nextInt(60 - 1) + 1;
            if (randomOperation == 0 && changeSpeed < this.maxSpeed) {
                this.maxSpeed = this.maxSpeed - changeSpeed;
                System.out.println(this.maxSpeed);
                break;
            } else if (randomOperation == 1) {
                this.maxSpeed = this.maxSpeed + changeSpeed;
                System.out.println(this.maxSpeed);
                break;
            }
        }
    }

    public void changeColor(){
        int newColor = random.nextInt(6);
        if(newColor == 0){
            this.color = "black";
            System.out.println(this.color);
        }
        else if(newColor == 1){
            this.color = "white";
            System.out.println(this.color);
        }
        else if(newColor == 2){
            this.color = "red";
            System.out.println(this.color);
        }
        else if(newColor == 3){
            this.color = "yellow";
            System.out.println(this.color);
        }
        else if(newColor == 4){
            this.color = "pink";
            System.out.println(this.color);
        }
        else if(newColor == 5){
            this.color = "blue";
            System.out.println(this.color);
        }
    }

}
