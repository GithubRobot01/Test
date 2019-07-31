package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//ArrayList嵌套HashMap
public class MapInArr {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> list=new ArrayList<>();
        HashMap<String,String> hm1=new HashMap<>();
        hm1.put("梁山伯","祝英台");
        hm1.put("罗密欧","朱丽叶");
        list.add(hm1);
        HashMap<String,String> hm2=new HashMap<>();
        hm2.put("牛郎","织女");
        hm2.put("许仙","白素贞");
        list.add(hm2);
        HashMap<String,String> hm3=new HashMap<>();
        hm3.put("杨过","小龙女");
        hm3.put("郭靖","黄蓉");
        list.add(hm3);
        //遍历ArrayList集合
        for (HashMap<String, String> map : list) {
            //获取ArrayList集合中的HashMap集合
            Set<String> set = map.keySet();
            //遍历HashMap集合
            for (String s : set) {
                System.out.println(s+"->"+map.get(s));
            }
            System.out.println("--------");
        }
    }
}
