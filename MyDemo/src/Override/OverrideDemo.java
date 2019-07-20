package Override;

public class OverrideDemo {
    public static void main(String[] args) {
        //子类构造方法中有一个默认隐含的"super()"调用
        //所以先调用父类的构造方法,后执行子类的构造方法
        Son s=new Son();
        s.play();
    }
}
