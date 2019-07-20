package InterfaceStatic;
/*
注意事项:不同通过接口实现类的对象调用接口中的静态方法
直接通过接口名称调用其中的静态方法
*/
public class MyInterfaceStaticDemo {
    public static void main(String[] args) {
       /* MyInterfaceStaticImpl Impl=new MyInterfaceStaticImpl();
       //错误的写法
        Impl.methodStatic();*/

        //直接通过接口名称调用接口默认方法
        MyInterfaceStatic.methodStatic();
    }
}
