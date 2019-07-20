package SuperDemo;

public class Fu /*extends Object*/{
    //Object类中只提供了无参构造
    //没有构造方法的时候,根据父类生成默认的无参构造方法
    private String name;

    // 默认无参
    public Fu() {
        System.out.println("父类无参构造方法被调用!");
    }


    //
    public Fu(String name) {
        System.out.println("父类有参构造方法被调用!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
