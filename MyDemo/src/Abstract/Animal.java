package Abstract;

public abstract class Animal {
    //不能直接创建new抽象类对象
    //必须用一个子类来继承抽象父类
    //子类必须覆盖重写抽象父类当中所有的抽象方法
    public abstract void eat();
}
