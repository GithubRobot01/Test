package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aa");
        list.add("aa");
        list.add("c");
        list.add("bbb");
        list.add("cccc");
        list.add("bb");
        list.add("ddd");
        list.add("acd");
        list.add("bba");
        list.add("ab");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num= s1.length()-s2.length();
                int num2=num==0?s1.compareTo(s2):num;
                return num2;
            }
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}
