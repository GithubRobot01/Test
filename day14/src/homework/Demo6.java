package homework;

import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        String[] stringArray = { "Barbara", "James", "mary", "john", "Patricia", "Robert", "Michael", "Linda" };
        //我们知道，这个数组中的字符串对象，都有compareToIgnoreCase 的方法，
        // 请使用方法引用实现该需求
        Arrays.sort(stringArray,String::compareToIgnoreCase);
        for (String s : stringArray) {
            System.out.print(s+" ");
        }
    }
}
