package red;

import java.util.ArrayList;
import java.util.Random;

public class RandomRed implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int leftMoney = totalMoney;  //剩余金额
        int leftcount = totalCount;  //剩余未发人数
        for (int i = 0; i < totalCount-1; i++) {
            int money=r.nextInt(leftMoney/leftcount*2)+1;
            list.add(money);
            leftMoney-=money;
            leftcount--;
        }
        list.add(leftMoney);
        return list;
    }
}
