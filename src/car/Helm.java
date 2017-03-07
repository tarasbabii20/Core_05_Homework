package car;

import java.util.Random;

/**
 * Created by Taras on 05.03.2017.
 */
public class Helm {

    private Random random = new Random();
    private int diameter;
    private String color;

    public Helm(int diameter, String color) {
        this.diameter = diameter;
        this.color = color;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void changeDiameter(){
        int randomOperation = random.nextInt(2);
        while (true) {
            int diameter = random.nextInt(21 - 10) + 10;
            if (randomOperation == 0 && diameter < this.diameter) {
                this.diameter = this.diameter - diameter;
                System.out.println(this.diameter);
                break;
            } else if (randomOperation == 1) {
                this.diameter = this.diameter + diameter;
                System.out.println(this.diameter);
                break;
            }
        }
    }

    public void changeColor(){
        int newColor = random.nextInt(3);
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
    }
}
