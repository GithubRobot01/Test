package InterfaceDefault;
/*
接口不能直接使用,必须有一个"实现类"来"实现"接口
*/
public interface MyInterface {
    public abstract void method1();
    public  void method2();
    abstract void method3();
    void method4();
    public default void methodDefault(){
        System.out.println("这是一个默认方法!");
    }
}
