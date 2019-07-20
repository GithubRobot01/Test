package MultiUpAndDown;
/*
怎样才能知道一个父类引用的对象,本来是什么子类?
格式:
对象 instanceof 类型
会得到一个boolean类型的结果,也就是判断前面的对象能不能当做后面类型的实例
*/
public class InstanceofDemo {
    public static void main(String[] args) {
        Animal animal=new Dog();

        //如果希望调用子类特有方法,需要向下转型
       whichAnimal(new Dog());
        System.out.println("========");
       whichAnimal(new Cat());
    }
    public static void whichAnimal(Animal animal){
        //判断一下父类引用的animal本来是不是Dog
        if(animal instanceof Dog){
            Dog dog=(Dog)animal;
            dog.watchHouse();
            dog.eat();
        }
        //判断一下父类引用的animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.catchMouse();
            cat.eat();
        }
    }
}
