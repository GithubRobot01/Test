package Predicate;

import java.util.function.Predicate;

public class Or {
    public static boolean method(String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s="abcd";
        boolean b=method(s,str->str.length()>5,str->str.contains("a"));
        System.out.println(b);
    }
}
