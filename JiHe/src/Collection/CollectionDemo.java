package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
Collection是所有单列集合的父接口，
因此在Collection中定义了所有单列集合(List和Set)通用的一些方法。
方法如下：
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      public void clear() :清空集合中所有的元素。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到数组中。
*/
public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象,可以使用多态
        Collection<String> list=new ArrayList<>();
        System.out.println(list);  //重写了toString方法
        list.add("张三");  //返回值为boolean值
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        System.out.println(list.remove("李四"));
        System.out.println(list.remove("李四"));
        System.out.println(list.contains("张三"));
        System.out.println(list.isEmpty()); //返回值为boolean类型
        System.out.println(list.size());
        Object[] arr=list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        list.clear(); //清空集合,但集合还存在
        System.out.println(list);
    }
}
