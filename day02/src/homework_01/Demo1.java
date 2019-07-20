package homework_01;

public class Demo1 {
    /*
        请在main方法中通过多态创建对象，随后使用对象，使得程序符合最终运行结果
     */
    public static void main(String[] args) {
        Fu f=new Zi();
        System.out.println(f.num);
        f.method();
        Zi z=(Zi) f;
        z.show();
    }
}

class Fu {
    int num = 10;

    public void method(){
        System.out.println("父类的method方法");
    }
}

class Zi extends Fu{
    int num = 20;

    public void method(){
        System.out.println("子类的method方法");
    }

    public void show(){
        System.out.println("子类的show方法");
    }
}