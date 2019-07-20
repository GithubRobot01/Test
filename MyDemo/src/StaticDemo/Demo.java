package StaticDemo;

/*
当第一次用到本类时,静态代码块执行唯一的一次
静态内容总是优先于非静态,所以静态代码块的执行比构造方法先执行

静态代码块的用途:用来一次性地对静态成员变量进行赋值
*/
public class Demo {
    public static void main(String[] args) {
        student stu1=new student();
        System.out.println(student.list); //[张三, 李四],说明静态代码块只执行了一次
        student stu2=new student();
        System.out.println(student.list); //[张三, 李四],说明静态代码块只执行了一次
    }

}
