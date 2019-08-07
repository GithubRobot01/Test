package homework04_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pool {
    private int[] prizePool = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    private ArrayList<Integer> list;
    private Random r = new Random();

    public Pool() {
        list=new ArrayList<>();
        list.addAll(List.of(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000));
    }

    public boolean get(String name){
        if (list.size()==0){
            return false;
        }
        int num=list.remove(r.nextInt(list.size()));
        System.out.println(name+"抽到的奖金为"+num);
        return true;
    }
}
