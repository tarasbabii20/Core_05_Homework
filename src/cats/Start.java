package cats;

/**
 * Created by Taras on 05.03.2017.
 */
public class Start {

    private Cat cat = new Cat("Chordata", "Mammalia", "Felidae", "Domestic", "Felis", "Felis catus");
    private Jaguar jaguar = new Jaguar("Chordata", "Mammalia", "Felidae", "Wild", "Panthera", "Panthera onca");

    public void start(){
        cat.breath();
        cat.eat();
        cat.move();
        cat.reproduction();
        cat.voice();
        cat.play();
        jaguar.voice();
        jaguar.hunting();
        classTest(cat);
        classTest(jaguar);
    }

    public static void classTest(Animal animal){
        System.out.print(animal.getClass().getSimpleName() + " instance of ");
        if(animal instanceof Animal){
            System.out.print("Animal ");
        }
        if(animal instanceof Cats){
            System.out.print("Cats ");
        }
        if(animal instanceof Domestic){
            System.out.print("Domestic ");
        }
        if(animal instanceof Wild){
            System.out.print("Wild ");
        }
        if(animal instanceof Cat){
            System.out.println("Cat ");
        }
        if(animal instanceof Jaguar){
            System.out.println("Jaguar ");
        }
    }
}
