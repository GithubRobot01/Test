package homework;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        // 1. 创建HashSet集合
        HashSet<String> hs = new HashSet<>();
        // 2. 添加数据到集合
        hs.add("itcast");
        hs.add("itheima");
        hs.add("javase");
        // 3. 迭代器遍历集合元素
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s); // 元素
            System.out.println(s.length()); // 元素长度
        }
    }
}
