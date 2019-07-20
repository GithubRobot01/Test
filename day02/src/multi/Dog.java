package multi;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+"狗吃Shit");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}
