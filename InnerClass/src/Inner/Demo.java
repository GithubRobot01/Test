package Inner;
/*
如何使用成员内部类?
1.间接方式:在外部类的方法中,使用内部类,然后main方法调用外部类的方法
2.直接方式:外部类名称.内部类名称 对象名=new 外部类名称().内部类名称();
*/
public class Demo {
    public static void main(String[] args) {
        Body body=new Body();
        //通过外部类的对象,调用外部类的方法,里面间接在使用内部类
        body.methodBody();
        System.out.println("===========");
        Body.Heart heart=new Body().new Heart();
        heart.beat();
    }
}
