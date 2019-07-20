package InterfacePrivate;
/*
问题描述:
我们需要抽取一个公共的方法,用来解决两个默认方法之间重复代码的问题
但是这个方法不应该让实现类使用,应该是私有化的

接口允许定义私有方法
1.普通私有方法:解决多个默认方法之间重复代码问题
private 返回值类型 方法名(参数列表){
方法体
}
2.静态私有方法:解决多个静态方法之间重复代码问题
private static 返回值类型 方法名(参数列表){
方法体
}
*/
public interface MyInterfacePrivate {
    public static void methodStaticA(){
        System.out.println("静态方法A!");
        methodCommon();
    }
     public static void methodStaticB(){
        System.out.println("静态方法B!");
        methodCommon();
    }

     private static void methodCommon(){
        System.out.println("公共语句1");
        System.out.println("公共语句2");
        System.out.println("公共语句3");
    }
}
