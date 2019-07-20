package multi;

public class AnimalOperator {

    public void use(Animal a){
        a.eat();
        if (a instanceof Cat){
            Cat c=(Cat) a;
            c.play();
        }else if (a instanceof Dog){
            Dog d=(Dog) a;
            d.lookHome();
        }
    }

}
