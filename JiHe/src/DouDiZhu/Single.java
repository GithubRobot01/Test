package DouDiZhu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//1.准备牌 2.洗牌 3.发牌 4.看牌
public class Single {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合,泛型使用String
        ArrayList<String> poker=new ArrayList<>();
        //定义两个数组,一个存储花色,另一个存储序号
        String[] colors={"♥","♦","♠","♣"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组,组装52张牌
        /*for (int i = 0; i < colors.length; i++) {
            for (int i1 = 0; i1 < numbers.length; i1++) {
                System.out.print(colors[i]+numbers[i1]);
            }
            System.out.println();
        }*/
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color+number);
            }
        }
        //2.洗牌 使用集合的工具类Collections中的方法
        //static void shuffle<List<?> list) 使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);
        //3.发牌 定义4个集合,存储玩家的牌和底牌
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if(i>=51){
                dipai.add(s);
            }else if (i%3==0){
                player01.add(s);
            }else if (i%3==1){
                player02.add(s);
            }else if(i%3==2){
                player03.add(s);
            }
        }
        //4.看牌
        System.out.println("周润发:"+player01);
        System.out.println("周星驰:"+player02);
        System.out.println("刘德华:"+player03);
        System.out.println("底牌:"+dipai);
    }
}
