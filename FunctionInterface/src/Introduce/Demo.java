package Introduce;
public class Demo {
    public static void show(Inter inter){
        inter.method();
    }

    public static void main(String[] args) {
        show(new InterImpl());
        show(new Inter() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类实现接口中的方法");
            }
        });
        show(()-> System.out.println("使用Lambda表达式实现接口中的方法"));
    }
}
