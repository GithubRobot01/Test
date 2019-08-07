package SuperDemo;

public class Zi extends Fu{

    public Zi(String name) {
        //每个子类的构造方法,第一行都有一个默认的super()语句,保证子类初始化之前父类的成员先初始化
        //如果父类没有无参构造,通过super(参数列表)去访问父类的带参构造
        //保证子类初始化之前父类先初始化
        super(name);
        System.out.println("子类有参构造方法被调用!");
    }
    // 默认无参 -- 依据父类生成的, 要么父类提供无参,要么子类也提供有参的,至少得保证有一个父类的构造能够被访问
    // 子类必须至少有一个构造能够访问父类的

    public Zi() {
        super("jack");
        System.out.println("子类无参构造方法被调用!");
    }

}
