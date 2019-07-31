package homework;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        /*while (true){
            String s=sc.next();
            if (s.equals("end")){
                break;
            }
            String key=s;
            if (map.containsKey(key)){
                int value=map.get(key);
                map.put(key,++value);
            }else {
                map.put(key,1);
            }
        }*/
        String line;
        while (!(line=sc.next()).equals("end")){
            map.put(line,map.containsKey(line)?map.get(line)+1:1);
        }
        Set<String> set = map.keySet();
        for (String s2 : set) {
            System.out.println(s2+"售出数量:"+map.get(s2));
        }
    }
}
