package Other;

import java.lang.String;
import java.util.Arrays;

public class SubstringDemo {
    public static void main(String[] args) {
        String s="aaa,bbb,ccc";
        char[] chars=s.toCharArray();//将字符串拆分为字符数组
        byte[] bytes=s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+" ");
        }
        String s1=s.replace(',','*');
        System.out.println(s1);
        String[] str=s.split(",");
        //split参数为正则表达式,如果按照.进行切割,必须写\\.
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        int[] a={1,2,3};
        String s2="[";
        for (int i = 0; i < a.length; i++) {
            if (i==a.length-1){
                s2+=a[i];
            }else{
                s2+=a[i]+",";
            }
        }
        s2+="]";
        System.out.println(s2);
        System.out.println(s2.charAt(2));
        char[] ss2=s2.toCharArray();
        for (int i = 0; i < ss2.length; i++) {
            System.out.print(ss2[i]);
        }
        String str2 = Arrays.toString(ss2);
    }
}
