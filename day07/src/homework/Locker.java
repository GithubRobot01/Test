package homework;

import java.util.HashMap;
import java.util.Random;

public class Locker {
    private int size;
    private HashMap<Integer,String> map;

    public Locker(int size, HashMap<Integer, String> map) {
        this.size = size;
        this.map = map;
    }

    public void store(String s){//传入物品名称
        if(map.size()>=size){
            System.out.println("存储柜已满!");
        }else {
            while (true){
                int pass=new Random().nextInt(9999-1000+1)+1000;
                //存入物品
                if (!map.containsKey(pass)){
                    System.out.println("存货成功，取货码为:"+pass);
                    map.put(pass,s);
                    break;
                }
            }

        }
    }
    public void get(int pass){//传入密码
        if (map.isEmpty()||!map.containsKey(pass)){
            System.out.println("没有该取货码，请检查.");
        }else {
            System.out.println("取货成功。请收好您的"+map.remove(pass));
        }
    }
}
