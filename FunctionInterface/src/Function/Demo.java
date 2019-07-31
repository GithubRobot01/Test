package Function;

import java.util.function.Function;

public class Demo {
    public static void getAge(String s, Function<String,Integer> fun){
        int i=fun.apply(s);
        System.out.println(i);
    }

    public static void main(String[] args) {
        String s="张三,20";
        getAge(s,str->{
            int i=Integer.parseInt(s.split(",")[1]);
            return i+10;
        });
    }
}
