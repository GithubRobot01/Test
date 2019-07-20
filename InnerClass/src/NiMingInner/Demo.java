package NiMingInner;
/*
匿名内部类的定义格式:
接口名称 对象名=new 接口名称(){
    覆盖重写所有的抽象方法
};
 */
public class Demo {
    public static void main(String[] args) {
        MyInterface obj=new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();
    }
}
