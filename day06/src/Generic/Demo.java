package Generic;

public class Demo {
    public static void main(String[] args) {
        InterImpl i1=new InterImpl();
        i1.show("sss");
        i1.show(123);

        InterImpl<Integer> i2=new InterImpl<>();
        i2.show(123);
        System.out.println("====");
        InterImpl2 i3=new InterImpl2();
        i3.show("wewr");
        //i3.show(222);
    }
}
