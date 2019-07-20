package Other;

import java.util.Scanner;

//计算短字符串在长字符串中出现的次数
public class StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个长字符串:");
        String chang=sc.next();
        System.out.println("请输入一个短字符串:");
        String duan=sc.next();
        String s = chang.replaceAll(duan, "");
        int i=(chang.length()-s.length())/duan.length();
        System.out.println("短字符串在长字符串中出现的次数为:"+i);
    }
}
