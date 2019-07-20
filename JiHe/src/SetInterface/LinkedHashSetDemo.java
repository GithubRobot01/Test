package SetInterface;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*
java.util.LinkedHashSet集合extends HashSet集合
LinkedHashSet集合特点;底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("def");
        set.add("abc");
        set.add("ghi");
        set.add("abc");
        System.out.println(set);//无序
        LinkedHashSet<String> link=new LinkedHashSet<>();
        link.add("def");
        link.add("abc");
        link.add("ghi");
        link.add("abc");
        System.out.println(link);//有序
    }
}
