package homework_03;

public class Demo {
    public static void main(String[] args) {
        Animal d=new Dog(2,"黑");
        System.out.println(d);
        Person p1=new Person("老王",30);
        p1.keepPet(d,"骨头");

        Animal c=new Cat(3,"灰");
        System.out.println(c);
        Person p2=new Person("老李",25);
        p1.keepPet(c,"鱼");
    }
}
