package FanXing;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符  ? 代表任意的数据类型
使用方式:不能创建对象使用  只能作为方法的参数使用
 */
public class TongPeiFu {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(66);
        list1.add(88);
        ArrayList<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");
        printArray(list1);
        printArray(list2);
    }
    //定义一个方法,可以遍历所有类型的ArrayList集合
    //这时候我们不知道ArrayList集合使用什么数据类型,可以用泛型的通配符?来接收数据类型
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();  //用迭代器遍历集合
        while (it.hasNext()){
            Object obj=it.next();  //Object可以接收任意的数据类型
            System.out.println(obj);
        }
    }
}
