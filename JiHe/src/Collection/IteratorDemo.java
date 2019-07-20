package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口:迭代器(对集合进行遍历)
Iterator迭代器是一个接口,无法直接使用,需要使用Iterator接口的实现类对象,获取实习那类的方式比较特殊
Collection接口中有一个方法iterator(),这个方法返回的就是迭代器的实现类对象
迭代器的使用步骤:
1.使用集合中的方法iterator()获取迭代器的实现类方法,使用Iterator接口接收(多态)
2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
3.使用Iterator接口中的方法next取出集合中的下一个元素

Iterator接口的常用方法如下：
public E next():返回迭代的下一个元素。
public boolean hasNext():如果仍有元素可以迭代，则返回 true。
*/
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("万强胜");
        list.add("魏泽源");
        list.add("董礼");
        list.add("王洋洋");
        list.add("王毅");
        list.add("韩震");
        //Iterator<E>接口也是有泛型的,迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型
        //多态  接口             实现类对象
        Iterator<String> it=list.iterator(); //获取迭代器的实现类对象,并且把指针(索引)指向集合的-1索引
        /*System.out.println(it.hasNext());
        String s1=it.next();
        System.out.println(s1);
        System.out.println(it.hasNext());
        String s2=it.next();
        System.out.println(s2);
        System.out.println(it.hasNext());
        String s3=it.next();
        System.out.println(s3);
        System.out.println(it.hasNext());
        String s4=it.next();
        System.out.println(s4);
        System.out.println(it.hasNext());
        String s5=it.next();
        System.out.println(s5);
        System.out.println(it.hasNext());
        String s6=it.next();
        System.out.println(s6);
        System.out.println(it.hasNext());*/
       // String s7=it.next(); 没有元素会抛出NoSuchElementException
        System.out.println("=======================");
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("======================");
        for (Iterator<String> it2=list.iterator();it2.hasNext();) {
            String s=it2.next();
            System.out.println(s);
        }
    }
}
