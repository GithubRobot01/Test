package Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
java.util.Properties集合extends Hashtable<k,v> implements Map<k,v>
Properties类表示了一个持久的属性集.Properties可保存在流中或从流中加载
propertises集合是唯一一个和IO流相结合的集合
    可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
    可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用
属性列表中每个键及其对应值都是一个字符串
Properties集合是一个双列集合,key和value默认都是字符串
 */
public class Demo {
    public static void main(String[] args) {
        show01();
    }
    //Properties集合的方法
    //String getProperty(String key) 用指定的键在此属性列表中搜索属性
    //setProperty(String key,String value) 调用 Hashtable的方法put
    //Set<String> stringPropertyNames() 返回此属性列表中的键集,其中该键及其对应值是字符串
    //此方法相当于Map集合中的keyset方法
    private static void show01() {
        Properties pro=new Properties();
        pro.setProperty("张三","176");
        pro.setProperty("李四","174");
        pro.setProperty("王五","179");
        pro.setProperty("赵六","180");
        //把properties集合中的键取出,存储到一个set集合中
        Set<String> set = pro.stringPropertyNames();
        //遍历set集合
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            String value=pro.getProperty(key);
            System.out.println(key+","+value);
        }
        System.out.println("===========");

        for (String s : set) {
            String value = pro.getProperty(s);
            System.out.println(s+","+value);
        }
    }
}
