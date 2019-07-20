package MultiUpAndDown;

/*
向上转型一定是安全的,但有一定的弊端
对象一旦向上转型为父类,那么就无法调用子类特有的内容

解决方案:用对象的向下转型[还原]
*/
public class UpAndDownDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
//      animal.catchmouse();
//      错误写法!

        //向下转型,进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();//猫捉老鼠
        System.out.println("============");
        //错误的向下转型,ClassCastException
        //Dog dog = (Dog) animal;
    }
}
