package MultiDemo;
/*
* 访问成员变量的两种方法
* 1.直接通过对象名称访问成员变量:看等号左边是谁就优先用谁,没有则向上找
* 2.间接通过成员方法访问成员变量:看该方法属于谁就优先用谁,没有则向上找
* */
public class FieldDemo {
    public static void main(String[] args) {
        Fu obj=new Zi();
        System.out.println(obj.num);
        System.out.println("=============");
        //子类没有覆盖重写就是父
        //子类覆盖重写就是子
        obj.shownum();
        System.out.println(obj);
    }
}
