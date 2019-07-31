package ConstructorMethodRef;

public class Demo {
    //定义方法,参数传递姓名和接口,方法通过姓名创建对象
    public static void printName(String name,PersonBuilder p){
        Person person = p.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        printName("张三",name->new Person(name));
        /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name) 已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        printName("李四",Person::new);
    }
}
