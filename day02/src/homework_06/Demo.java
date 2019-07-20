package homework_06;

public class Demo {
    public static void main(String[] args) {
        Feeder feeder=new Feeder();
        Animal d=new Dog();
        feeder.feed(d);
        Animal f=new Frog();
        feeder.feed(f);
        Animal s=new Sheep();
        feeder.feed(s);
    }
}
