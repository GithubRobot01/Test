package homework;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo9 {
    public static void main(String[] args) {
        String s="90 -7 0 18 2 0 2 2 45 4";
        TreeSet<String> set=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num1=Integer.valueOf(o1);
                int num2=Integer.valueOf(o2);
                int num=num2-num1;
                return num==0?1:num;
            }
        });
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            set.add(s1[i]);
        }
        System.out.println(set);
    }
}
