package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> map=new HashMap<>();
        map.put("1930", "乌拉圭");
        map.put("1934", "意大利");
        map.put("1938", "意大利");
        map.put("1950", "乌拉圭");
        map.put("1954", "西德");
        map.put("1958", "巴西");
        map.put("1962", "巴西");
        map.put("1966", "英格兰");
        map.put("1974", "西得");
        map.put("1978", "阿根廷");
        map.put("1982", "意大利");
        map.put("1986", "阿根廷");
        map.put("1990", "西得");
        map.put("1994", "巴西");
        map.put("1998", "法国");
        map.put("2002", "巴西");
        map.put("2006", "意大利");
        map.put("2010", "西班牙");
        map.put("2014", "德国");
        map.put("2018", "法国");
        Set<String> set = map.keySet();
        System.out.println("请输入年份:");
        String year=sc.next();
        if (!map.containsKey(year)){
            System.out.println(year+"年没有举办世界杯");
        }else{
            for (String s : set) {
                if (s.equals(year)){
                    String value=map.get(s);
                    System.out.println(year+"年的世界杯冠军是："+value);
                }
            }
        }

        System.out.println("请输入国家:");
        String city=sc.next();
        if(!map.containsValue(city)){
            System.out.println(city+"没有获得过世界杯冠军");
        }else{
            System.out.println(city+"获得世界杯的年份是：");
            for (String s : set) {
                String value=map.get(s);
                if (value.equals(city)){
                    System.out.println(s);
                }
            }
        }
    }
}
