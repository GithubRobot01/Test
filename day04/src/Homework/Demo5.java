package Homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) throws ParseException {
       System.out.println("请输入您入职的日期,格式为：xxxx年xx月xx日");
       String s = new Scanner(System.in).next();
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
       Date d1 = sdf.parse(s);
       Date d2=sdf.parse("2018年12月10日");
       long day=(d1.getTime()-d2.getTime())/(1000*60*60*24);
       System.out.println(day);

    }
}
