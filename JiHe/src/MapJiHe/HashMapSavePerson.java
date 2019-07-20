package MapJiHe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap存储自定义类型键值
Map集合保证键值是唯一的
    作为key的元素,必须重写hashCode和equals方法,以保证key唯一
*/
public class HashMapSavePerson {
    public static void main(String[] args) {
        //String类重写了hashCode与toString方法,可以保证key值唯一
        Map<String,Person> map=new HashMap<>();
        map.put("河南",new Person("张三",18));
        map.put("北京",new Person("李四",19));
        map.put("上海",new Person("王五",20));
        map.put("河南",new Person("武王",22));
        System.out.println(map);
        Set<String> set = map.keySet();
        for (String s : set) {
            Person value=map.get(s);
            System.out.println(s+"->"+value);
        }
        System.out.println("-------------");
        //key为Person类型,Person类必须重写hashCode和equals方法
        Map<Person,String> map1=new HashMap<>();
        map1.put(new Person("张三",18),"河南");
        map1.put(new Person("李四",19),"北京");
        map1.put(new Person("王五",20),"上海");
        map1.put(new Person("武王",22),"河南");
        map1.put(new Person("武王",22),"南京");
        Set<Map.Entry<Person, String>> set1 = map1.entrySet();
        for (Map.Entry<Person, String> entry : set1) {
            Person key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"->"+value);
        }
    }
}
