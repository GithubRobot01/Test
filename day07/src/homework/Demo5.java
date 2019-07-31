package homework;

import java.util.HashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        String s="wo ai heima wo ai java wo yao hao hao xue xi java";
        String[] s1 = s.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            String key=s1[i];
            if (map.containsKey(key)){
                int value=map.get(key);
                map.put(key,++value);
            }else {
                map.put(key,1);
            }
        }
        Set<String> set = map.keySet();
        for (String s2 : set) {
            System.out.print(s2+"("+map.get(s2)+")");
        }
    }
}
