package MapJiHe;
import java.util.HashMap;
import java.util.Map;
/*
java.util.Map<k,v>集合特点;
1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
3.Map集合中的元素,key是不允许重复的,value是可以重复的
4.Map集合中的元素,key和value一一对应
java.util.HashMap<k,v>集合 implements Map<k,v>接口  查询速度快
无序的集合存储和取出元素的顺序可能不一样
java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
底层是哈希表+链表 是一个有序的集合,存储和取出元素的顺序是一样的

public V put(K key,V value):把指定的键与指定的值添加到Map集合中。
public V remove(Object key):把指定的键所对应的键值对元素在Map集合中删除,返回被删除元素的值。
public V get(Object key):根据指定的键,在Map集合中获取对应的值。
public Set<K> keySet():获取Map集合中所有的键,存储到Set集合中。
public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)。
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        //public V put(k key,V value):把指定的键与指定的值添加到Map集合中
        //返回值:V key不重复,返回值为null,key重复,会使用新的value替换map中重复的value,返回被替换的value值
        String v1 = map.put("文杰", "翠花1");
        System.out.println(v1);
        String v2 = map.put("文杰", "翠花2");
        System.out.println(v2);
        map.put("杨过", "小龙女");
        map.put("梁山伯", "祝英台");
        map.put("罗密欧", "朱丽叶");
        map.put("过儿", "小龙女");
        System.out.println(map);
        String v = map.remove("过儿");
        System.out.println(v); //小龙女 存在返回value,否则返回null
        String v3 = map.get("梁山伯");
        System.out.println(v3); //祝英台 存在返回value,否则返回null
        boolean v4 = map.containsKey("文杰");
        System.out.println(v4); //有对应的key返回true,无则false
    }
}
