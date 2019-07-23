package Supplier;

import java.util.function.Supplier;

/*
常用的函数式接口:java.util.function.Supplier<T>
接口仅包含一个无参的方法:T get().用来获取一个泛型参数指定类型的对象数据
该接口被称为生产型接口,指定接口的泛型是什么类型,接口中的get方法就会生产什么类型的数据
 */
public class SupplierInter {
    //定义一个方法,方法的参数传递Supplier<T>接口,泛型执行String,get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String s1 = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "Supplier";
            }
        });
        System.out.println(s1);
        String s2=getString(()->"Supplier");
        System.out.println(s2);
    }
}
