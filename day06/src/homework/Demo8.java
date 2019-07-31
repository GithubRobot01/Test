package homework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张三");
        list.add("李四");
        list.add("张三");
        list.add("张三");
        // 调用去重方法
        single(list);
        System.out.println("list集合中元素为：" + list);
    }
    public static void single(ArrayList<String> list){
        LinkedHashSet<String> c=new LinkedHashSet<String>();
        c.addAll(list);
        list.clear();
        list.addAll(c);
    }
}
