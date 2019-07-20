package SuperDemo;

public class Test {
    public static void main(String[] args) {
//      父类无参构造方法被调用!
//      子类无参构造方法被调用!
        Zi zi=new Zi();

//      父类无参构造方法被调用!
//      子类有参构造方法被调用!
        Zi z=new Zi("还还");
    }
}
