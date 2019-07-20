package StaticDemo;

import java.util.ArrayList;

public class student {
    public static int number=2;
    public static ArrayList<String> list;
    static {
        number=3;
        list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        System.out.println("静态代码块执行!");
    }

    public student(){
        System.out.println("构造方法执行!");
    }
}
