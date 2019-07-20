package FanXing;

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        GenericInterfaceImpl gm=new GenericInterfaceImpl();
        gm.method("字符串");
        GenericInterfaceImpl02<Integer> gm2=new GenericInterfaceImpl02<>();
        gm2.method(111);
        GenericInterfaceImpl02<Double> gm3=new GenericInterfaceImpl02<>();
        gm3.method(66.66);
    }
}
