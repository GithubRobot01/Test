package InterfaceConst;
/*
接口当中也可以定义"成员变量",但必须使用public stactic final三个关键字进行修饰
一旦使用final关键字进行修饰,说明不可改变
接口中的常量,可以省略三个修饰的关键字,不写也是默认修饰

接口中的常量,必须进行赋值
*/
public interface MyInterfaceconst {
    //一旦修改,不可改变
    //名称推荐使用大小字母
    public static final int NUM_OF_MY=10;

}
