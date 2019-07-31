package SuperMethodRef;

public class Student extends Person{
    @Override
    public void work() {
        System.out.println("活着就要不断学习!");
    }

    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        //调用method方法,方法的参数Greetable是一个函数式接口
        method(()->{
            //创建父类对象
            Person p=new Person();
            p.work();
        });
        //因为有子父类关系,所以存在的一个关键字super,代表父类,
        // 所以我们可以直接使用super调用父类的成员方法
        method(()->super.work());
      /*
           使用super引用类的成员方法
           super是已经存在的
           父类的成员方法sayHello也是已经存在的
           所以我们可以直接使用super引用父类的成员方法
       */
        method(super::work);
    }

    public static void main(String[] args) {
        new Student().show();
    }
}
