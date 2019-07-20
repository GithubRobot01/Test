package Collection;

import java.util.ArrayList;
import java.awt.List;

/*
增强for循环:底层使用的也是迭代器,使用for循环的格式,简化了迭代器的书写
Collection<E> extends Iterable<E>:所有的单列集合都可以使用增强for
public interface  Iterable<T>实现这个接口允许对象成为"foreach"语句的目标.
增强对象for循环:用来遍历集合和数组
格式:
    for(集合/数组的数据类型  变量名:集合名/数组名){
        sout(变量名); }
 */
public class ForEachDemo {
    public static void main(String[] args) {
        //用增强for循环遍历数组
        int[] arr={1,2,3,4,5};
        for (int i:arr) {
            System.out.print(i+" ");
        }
        //用增强for循环遍历集合
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String s:list) {
            System.out.print(s+" ");
        }
    }
}
