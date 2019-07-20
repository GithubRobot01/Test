package ListInterface;

import java.util.LinkedList;

/*
public void addFirst(E e) :将指定元素插入此列表的开头。
public void addLast(E e) :将指定元素添加到此列表的结尾。
public E getFirst() :返回此列表的第一个元素。
public E getLast() :返回此列表的最后一个元素。
public E removeFirst() :移除并返回此列表的第一个元素。
public E removeLast() :移除并返回此列表的最后一个元素。
public E pop() :从此列表所表示的堆栈处弹出一个元素。
public void push(E e) :将元素推入此列表所表示的堆栈。
public boolean isEmpty() ：如果列表不包含元素，则返回true。
使用linkedList集合特有的方法,不能使用多态
*/
public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link); //[a, b, c]
        link.addFirst("www");
        System.out.println(link);  //[www, a, b, c]
        link.push("yyy"); //与addFirst等效
        System.out.println(link); //[yyy, www, a, b, c]
        link.addLast("ddd");
        System.out.println(link); //[yyy, www, a, b, c, ddd]
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        System.out.println(link.removeFirst()); //移除第一个元素
        System.out.println(link.removeLast()); //移除最后一个元素
        System.out.println(link); //[www, a, b, c]
        System.out.println(link.pop());  //相当于removeFirst()
        System.out.println(link); //[a, b, c]
        System.out.println(link.isEmpty());
    }
}
