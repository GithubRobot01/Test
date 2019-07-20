package ListInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//public void add(int index, E element):将指定的元素，添加到该集合中的指定位置上。
//public E get(int index):返回集合中指定位置的元素。
//public E remove(int index):移除列表中指定位置的元素, 返回的是被移除的元素。
//public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list); //不是地址,重写了toString方法
        list.add(3,"itheima");
        System.out.println(list);
        String remove = list.remove(2);
        System.out.println("被移除的元素:"+remove);
        System.out.println(list);
        String a = list.set(4, "A");
        System.out.println("被替换的元素:"+a);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
