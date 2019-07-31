package Introduce;

import java.util.ArrayList;

//使用传统的方式,遍历集合,对集合中的数据进行过滤
public class DemoList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三");
        list.add("张三丰");
        list.add("张良");
        list.add("张无忌");
        list.add("赵敏");
        list.add("章子怡");
        list.add("至尊宝");
        /*ArrayList<String> list2=new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                list2.add(s);
            }
        }
        ArrayList<String> list3=new ArrayList<>();
        for (String s : list2) {
            if (s.length()==2){
                list3.add(s);
            }
        }
        System.out.println(list3);*/
        //使用Stream流对上述程序进行优化
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
