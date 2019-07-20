package MapJiHe;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("b","B");
        map.put("a","A");
        map.put("d","D");
        map.put("a","C");
        System.out.println(map); //key不允许重复,无序
        LinkedHashMap<String,String> link=new LinkedHashMap<>();
        link.put("b","B");
        link.put("a","A");
        link.put("d","D");
        link.put("a","C");
        System.out.println(link); //key不允许重复,有序
    }
}
