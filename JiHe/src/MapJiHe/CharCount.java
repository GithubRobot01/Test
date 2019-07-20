package MapJiHe;

import java.util.HashMap;
import java.util.Scanner;

//计算一个字符串中每个字符出现的次数
public class CharCount {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        String s=new Scanner(System.in).next();
        //创建map集合,key是字符串中的字符,value是字符的个数
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:s.toCharArray()) {
            if (map.containsKey(c)){
                Integer value = map.get(c);
                map.put(c,++value);
            }else{
                map.put(c,1);
            }
        }
        for (Character key:map.keySet()) { //keyset() 返回键值
            Integer value = map.get(key);
            System.out.println(key+"->"+value);
        }
    }
}
