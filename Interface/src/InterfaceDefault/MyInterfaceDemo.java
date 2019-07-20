package InterfaceDefault;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        InterfaceImplA ImplA=new InterfaceImplA();
        ImplA.method1();
        ImplA.method2();
        ImplA.method3();
        ImplA.method4();
        /*
        接口的默认方法,可以通过接口的实现类,直接调用  例InterfaceImplA
        也可以被接口的实现类进行覆盖重写 例MyInterfaceDemo02
        */
        ImplA.methodDefault();
        System.out.println("========");
        InterfaceImplB ImplB=new InterfaceImplB();
        ImplB.methodDefault();
    }
}
