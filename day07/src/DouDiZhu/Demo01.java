package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
        //创建扑克
        String[] colors={"♥","♦","♠","♣"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        ArrayList<String> list=new ArrayList<>();
        list.add("大王");
        list.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                list.add(color+number);
            }
        }
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
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
        System.out.println("周润发:"+player01);
        System.out.println("周星驰:"+player02);
        System.out.println("刘德华:"+player03);
        System.out.println("底牌:"+dipai);
    }
}
