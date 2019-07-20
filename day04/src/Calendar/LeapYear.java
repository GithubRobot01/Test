package Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
       while (true){
           System.out.println("请输入一个年份:");
           int year=new Scanner(System.in).nextInt();
           Calendar c=Calendar.getInstance();
           c.set(year,2,1);
           c.add(Calendar.DATE,-1);
           int day=c.get(Calendar.DATE);
           if (day==28){
               System.out.println(year+"年是平年!");
           }else{
               System.out.println(year+"年是闰年!");
           }
       }
    }
}

