package homework;

import java.util.HashMap;
import java.util.Scanner;

public class LockerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> hm=new HashMap<>();
        Locker locker=new Locker(20,hm);
        System.out.println("请存入货物（以over结束）：");
        String s="over";
        while (!(s=sc.next()).equals("over")){
            locker.store(s);
        }
        System.out.println("请输入取货码（以over结束）：");
        while (!(s=sc.next()).equals("over")){
            int i=Integer.parseInt(s);
            locker.get(i);
        }
    }
}
