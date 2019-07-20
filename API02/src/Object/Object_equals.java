package Object;

import java.util.Objects;

public class Object_equals {
    /*
      Object的equals()方法默认比较的是两个对象的地址值
      重写equals()方法,使方法比较两个对象的属性(name,age)
      问题:隐含着一个多态
      多态的弊端:无法使用子类的特有内容(属性和方法)
      可以使用向下转型
    */
    public static void main(String[] args) {
        Student stu1=new Student("张三",22);
        Student stu2=new Student("李四",23);
        Student stu3=new Student("李四",23);
        System.out.println(stu1.equals(stu2));
        System.out.println(stu3.equals(stu2));
        System.out.println("=============");

        /*
        Objects类的equals方法:对两个对象进行比较,防止空指针异常
        public static boolean equals(Object a,objecy b){
            return (a==b)||(a!=null&&a.equals(b));
            }
         */
        System.out.println(Objects.equals(stu1,null));
    }

}
