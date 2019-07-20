package homework_02;

public class Person {
    public void eat(){
        System.out.println("吃饭");
    }
    public void work(){
        System.out.println("工作");
    }
}

class Superman extends Person{
    public void save(){
        System.out.println("救人");
    }
}

class Demo2{
    public static void main(String[] args) {
        Person p=new Superman();
        p.eat();
        p.work();
        Superman s=(Superman)p;
        s.save();
    }
}
