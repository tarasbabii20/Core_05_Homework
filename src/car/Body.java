package car;

import java.util.Random;

/**
 * Created by Taras on 05.03.2017.
 */
public class Body {

    private Random random = new Random();
    private String material;
    private String type;

    public Body(String material, String type) {
        this.material = material;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void changeMaterial(){
        int newMaterial = random.nextInt(3);
        if(newMaterial == 0){
            this.material = "steel";
            System.out.println(this.material);
        }
        else if(newMaterial == 1){
            this.material = "aluminum";
            System.out.println(this.material);
        }
        else if(newMaterial == 2){
            this.material = "carbon";
            System.out.println(this.material);
        }
    }

    public void changeType(){
        int newType = random.nextInt(5);
        if(newType == 0){
            this.type = "sedan";
            System.out.println(this.type);
        }
        else if(newType == 1){
            this.type = "hybrid";
            System.out.println(this.type);
        }
        else if(newType == 2){
            this.type = "pickup";
            System.out.println(this.type);
        }
        else if(newType == 3){
            this.type = "van";
            System.out.println(this.type);
        }
        else if(newType == 4){
            this.type = "wagon";
            System.out.println(this.type);
        }
    }
}
