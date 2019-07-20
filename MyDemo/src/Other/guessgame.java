package Other;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Date d=new Date();
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int number=r.nextInt(100)+1;//产生一个1-100的随机数字
        System.out.println("双人猜数字游戏(1-100的数字)");
        System.out.println("请输入第一位参与者的姓名:");
        ArrayList<String> str=new ArrayList<>();
        str.add(sc.next());
        System.out.println("请输入第二位参与者的姓名:");
        str.add(sc.next());
        int i=0;
        while(true){
            System.out.print(str.get(i)+",请输入你猜想的数字:");
            int guessnumber=sc.nextInt();
            if (guessnumber>number) {
                System.out.println(str.get(i) + ",你猜的数字" + guessnumber + "太大了!");
            } else if (guessnumber<number) {
                System.out.println(str.get(i) + ",你猜的数字" + guessnumber + "太小了!");
            }else{
                System.out.println(str.get(i)+",恭喜你获得胜利!");
                break;}
            i=(i+1)%2;
        }
    }
}
