package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        String s=new Scanner(System.in).nextLine();
        LinkedHashSet<Character> set=new LinkedHashSet();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            set.add(ch);
        }
        System.out.println(set);
    }
}
