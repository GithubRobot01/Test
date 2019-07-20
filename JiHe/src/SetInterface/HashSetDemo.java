package SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HashSet特点:1.不允许存储重复的元素
//2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
//3.是一个无序的集合,存储元素和取出元素的顺序可能不一样
//4.底层是一个哈希表结构(查询速度非常快)
public class HashSetDemo extends Object {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
