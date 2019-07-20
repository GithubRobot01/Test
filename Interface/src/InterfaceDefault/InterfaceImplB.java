package InterfaceDefault;

public class InterfaceImplB implements MyInterface{
    @Override
    public void method1() {
        System.out.println("这是第一个方法!");
    }

    @Override
    public void method2() {
        System.out.println("这是第二个方法!");
    }

    @Override
    public void method3() {
        System.out.println("这是第三个方法!");
    }

    @Override
    public void method4() {
        System.out.println("这是第四个方法!");
    }
    @Override
    public void methodDefault() {
        System.out.println("重写了接口的默认方法!");
    }
}
