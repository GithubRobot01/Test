package FanXing;

public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethod gm=new GenericMethod();
        //调用含有泛型的方法method01,传递什么类型,泛型就是什么类型
        gm.method01(10);
        gm.method01("hahaha");
        gm.method01(true);

        gm.method02("静态方法,不建议创建对象使用");
        GenericMethod.method02("静态方法");
    }
}
