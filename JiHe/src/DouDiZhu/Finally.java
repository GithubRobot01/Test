package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
斗地主综合案例:有序版本
1.准备牌 2.洗牌 3.发牌 4.排序 5.看牌
 */
public class Finally {
    public static void main(String[] args) {
        //1.准备牌 创建一个Map集合,存储牌的索引和组装好的牌
        HashMap<Integer,String> poker=new HashMap<>();
        //创建一个List集合,存储牌的索引
        ArrayList<Integer> pokerIndex=new ArrayList<>();
        //定义两个集合,存储花色和序号
        List<String> colors = List.of("♥", "♦", "♠", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        //2.洗牌
        Collections.shuffle(pokerIndex);
        //3.发牌
        ArrayList<Integer> pleyer01=new ArrayList<>();
        ArrayList<Integer> pleyer02=new ArrayList<>();
        ArrayList<Integer> pleyer03=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in=pokerIndex.get(i);
            if (i>=51){
                dipai.add(in);
            }else if (i%3==0){
                pleyer01.add(in);
            }else if (i%3==1){
                pleyer02.add(in);
            }else if (i%3==2){
                pleyer03.add(in);
            }
        }
        //4.排序
        Collections.sort(pleyer01);
        Collections.sort(pleyer02);
        Collections.sort(pleyer03);
        Collections.sort(dipai);
        //5.看牌
        lookPoker("刘德华",poker,pleyer01);
        lookPoker("周星驰",poker,pleyer02);
        lookPoker("周润发",poker,pleyer03);
        lookPoker("底牌",poker,dipai);
    }
    //5.看牌
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.print(name+": ");
        for (Integer key : list) {
            String value=poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
