package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*【编号：1601】现获取到学校的一些课程及授课老师的信息，
数据如下： 老师：Tom 课程：java 老师：Kevin 课程：python
老师：Lily 课程：c++ 老师：Lucy 课程：PHP 请将以上信息以字符串的形式一一对应存储在集合中，
并遍历展示，需要使用两种遍历方式。输出结果如下：
        Kevin---python
        Tom---java
        Lucy---php
        Lily---c++*/
public class Demo1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Tom","java");
        map.put("Kevin","python");
        map.put("Lily","c++");
        map.put("Lucy","PHP");
        Set<String> set = map.keySet();
        for (String s : set) {
            String kc=map.get(s);
            System.out.println(s+","+kc);
        }
        System.out.println("========");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
