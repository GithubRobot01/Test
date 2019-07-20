package multi;

public class Demo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Cat c1 = new Cat();
        Animal c2 = new Cat();
        ao.use(c1);
        ao.use(c2);
        System.out.println("=========");
        Animal d2=new Dog();
        Dog d3=new Dog();
        ao.use(d2);
        ao.use(d3);
        System.out.println("==========");
        Animal c3=new Cat();
        c3.setName("加菲");
        c3.setAge(3);
        c3.eat();
        Cat c5=(Cat) c3;
        c5.play();
        System.out.println(c3.getName()+"猫,"+c3.getAge()+"岁");
        System.out.println("============");
        Animal c4=new Cat("波斯",2);
        c4.eat();
        System.out.println(c4.getName()+"猫,"+c4.getAge()+"岁");
        System.out.println("==========");
        Animal d1=new Dog();
        d1.setName("金毛");
        d1.setAge(3);
        d1.eat();
        System.out.println(d1.getName()+"狗,"+d1.getAge()+"岁");
    }
}
