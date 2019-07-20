package interface_;

public class Demo {
    public static void main(String[] args) {
        Jumping j = new Cat();
        j.jump();
        System.out.println("-----------------");
        Animal a = new Cat("波斯", 3);
        a.eat();
        System.out.println(a.getName() + "," + a.getAge());
        System.out.println("-----------------");
        Cat c = new Cat();
        c.eat();
        c.jump();
    }
}
