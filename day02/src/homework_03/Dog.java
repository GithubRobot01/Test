package homework_03;

public class Dog extends Animal {
    @Override
    public void eat(String something){
        System.out.println(super.getAge()+"岁的"+super.getColor()+"颜色的狗两只前腿死死的抱住"+something+"猛吃");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }
}
