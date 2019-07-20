package Inner;

public class Demo {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.method();

        InnerInter ii=o.getInner();
        ii.show();
    }
}
