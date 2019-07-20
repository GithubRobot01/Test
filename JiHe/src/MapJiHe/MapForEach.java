package MapJiHe;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的第一种遍历方式:通过键找值的方式
Map集合中的方法: set<k> keyset 返回此映射中包含的键的set视图
实现步骤:
1. 使用Map集合中的方法keyset(),获取Map中所有的key，存储到一个Set集合中
2. 遍历键的Set集合，得到每一个键。
3. 根据键，获取键所对应的值。方法提示: get(K key)
 */
public class MapForEach {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("朱茵",173);
        map.put("林志玲",178);
        Set<String> set=map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key=it.next();
            Integer value=map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("-----------------");
        for (String s : set) {
            Integer value=map.get(s);
            System.out.println(s+"="+value);
        }
    }
}
