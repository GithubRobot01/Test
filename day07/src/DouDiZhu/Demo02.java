package DouDiZhu;

import com.sun.source.tree.Tree;

import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        //创建扑克
        String[] colors={"♥","♦","♠","♣"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        HashMap<Integer,String> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        map.put(0,"大王");
        list.add(0);
        map.put(1,"小王");
        list.add(1);
        int num=2;
        for (String number : numbers) {
            for (String color : colors) {
                map.put(num,color+number);
                list.add(num);
                num++;
            }
        }
        //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> player01=new TreeSet<>();
        TreeSet<Integer> player02=new TreeSet<>();
        TreeSet<Integer> player03=new TreeSet<>();
        TreeSet<Integer> dipai=new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (i>=51){
                dipai.add(list.get(i));
            }else if (i%3==0){
                player01.add(list.get(i));
            }else if (i%3==1){
                player02.add(list.get(i));
            }else{
                player03.add(list.get(i));
            }
        }
        System.out.print("周润发:");
        lookPoker(player01,map);
        System.out.print("周星驰:");
        lookPoker(player02,map);
        System.out.print("刘德华:");
        lookPoker(player03,map);
        System.out.print("底牌:");
        lookPoker(dipai,map);
    }
    public static void lookPoker(TreeSet<Integer> set,HashMap<Integer,String> map){
        for (Integer i : set) {
            String value=map.get(i);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
