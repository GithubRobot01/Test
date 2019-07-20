package MapJiHe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的第二种遍历方式:使用Entry对象遍历
Map集合中的方法:
Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)。
实现步骤：
1. 使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
2. 遍历Set集合，得到每一个键值对(Entry)对象。
3. 通过键值对(Entry)对象，使用getkey()和getValue()获取Entry对象中的键与值。
 */
public class EntryForEach {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("朱茵",173);
        map.put("林志玲",178);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("---------------------");
        for (Map.Entry<String, Integer> entry : set) {
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"="+value);
        }
        
    }
}
