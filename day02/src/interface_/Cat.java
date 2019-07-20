package interface_;

public class Cat extends Animal implements Jumping {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫调高");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }
}
