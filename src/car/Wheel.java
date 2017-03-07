package car;

import java.util.Random;

/**
 * Created by Taras on 05.03.2017.
 */
public class Wheel {
    private Random random = new Random();
    private int size;
    private int weight;

    public Wheel(int size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void changeSize(){
        int diameter = random.nextInt(14 - 5) + 5;
        this.size = (int)(Math.PI * diameter);
        System.out.println(this.size);
    }

    public void changeWeight(){
        int randomOperation = random.nextInt(2);
        while (true) {
            int weight = random.nextInt(20 - 10) + 10;
            if (randomOperation == 0 && weight < this.weight) {
                this.weight = this.weight - weight;
                System.out.println(this.weight);
                break;
            } else if (randomOperation == 1) {
                this.weight = this.weight + weight;
                System.out.println(this.weight);
                break;
            }
        }
    }
}
