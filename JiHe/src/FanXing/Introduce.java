package FanXing;
import java.util.ArrayList;
import java.util.Iterator;

/*
泛型:一种未知的数据类型,当我们不知道使用什么数据类型的时候,可以使用泛型
泛型也可以看作一个变量,用来接收数据类型
ArrayList集合在定义的时候,不知道集合中都会存储什么类型,所以类型使用泛型
 */
public class Introduce {
    public static void main(String[] args) {
//        创建集合对象,不使用泛型
//        好处:默认的类型就是Object类型
//        弊端:不安全,会引发异常
        ArrayList list=new ArrayList();
        list.add("abc");
        list.add(1);
        //使用迭代器遍历list集合
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
            //不能使用String类特有的方法length,需要向下转型,可能会抛出ClassCastException类型转换异常
//            String s=(String)obj;
//            System.out.println(s.length());
//        创建集合对象,不使用泛型
//        好处:避免了类型转化的麻烦,存储的是什么类型,取出的就是什么类型
//             把运行期异常(代码运行之后会抛出异常),提升到编译器
//        弊端:泛型是什么类型,只能存储什么类型的数据
        }
    }
}
