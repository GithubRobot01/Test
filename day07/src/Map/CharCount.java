package Map;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//键盘录入字符串,统计每个字符出现的次数
public class CharCount {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        String s=new Scanner(System.in).next();
        TreeMap<Character,Integer> map=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (map.containsKey(c)){
                int value = map.get(c);
                map.put(c,++value);
            }else {
                map.put(c,1);
            }
        }
        Set<Character> ch = map.keySet();
        for (Character character : ch) {
            int value=map.get(character);
            System.out.print(character+"("+value+")");
        }
    }
}
