package homework04;

import java.util.Random;

public class PrizePool {
    private String next="A";
    int[] prizePool = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    boolean[] prize={true,true,true,true,true,true,true,true,true,true};
    //用来记录数组中剩余的数量
    int num=10;
    int i;
    private Object obj=new Object();
    public synchronized void A(){
        if (next.equals("B")){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (num>0){
            int index=new Random().nextInt(10);
            while (!prize[index]){
                index=new Random().nextInt(10);
            }
            prize[index]=false;
            System.out.println("A抽出奖金"+prizePool[index]);
            num--;
        }
        next="B";
        notify();
    }

    public synchronized void B(){
        if (next.equals("A")){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (num>0){
            int index=new Random().nextInt(10);
            while (!prize[index]){
                index=new Random().nextInt(10);
            }
            prize[index]=false;
            System.out.println("B抽出奖金"+prizePool[index]);
            num--;
        }
        next="A";
        notify();
    }
}
