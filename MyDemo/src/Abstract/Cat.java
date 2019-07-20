package Abstract;

public class Cat extends Animal {
    //抽象类的子类,必须覆盖重写抽象父类中所有的抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
