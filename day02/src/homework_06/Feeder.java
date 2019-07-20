package homework_06;

public class Feeder {
    public void feed(Animal a){
        a.drink();
        a.eat();
        if (a instanceof Dog){
            ((Dog) a).swim();
        }else if (a instanceof Frog){
            ((Frog) a).swim();
        }
    }
}
