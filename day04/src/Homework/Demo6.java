package Homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
1
主题切换成功,当前时间为：2018年12月10日

请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
4
很抱歉，操作有误，已为您切换默认主题
主题切换成功,当前时间为：2018年12月10日
 */
public class Demo6 {
    public static void main(String[] args) throws ParseException {
       System.out.println("请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
       int i = new Scanner(System.in).nextInt();
       switch (i){
           case 1:
               theme1("yyyy年MM月dd日");
               break;
           case 2:
               theme1("yyyy-MM-dd");
               break;
           case 3:
               theme1("yyyy/MM/dd");
               break;
           default: {
               System.out.println("很抱歉，操作有误，已为您切换默认主题");
               theme1("yyyy年MM月dd日");
           }
       }
    }
    public static void theme1(String f){
        SimpleDateFormat sdf=new SimpleDateFormat(f);
        Date d=new Date();
        String format = sdf.format(d);
        System.out.print("主题切换成功,当前时间为:");
        System.out.println(format);
    }
}
