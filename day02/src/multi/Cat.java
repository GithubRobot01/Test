package multi;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+"猫吃鱼");
    }

    public void play(){
        System.out.println(super.getName()+"猫玩线团");
    }
}
