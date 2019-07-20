package red;

import java.util.ArrayList;

public class NormalRed implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        int avg=totalMoney/totalCount;  //平均每人的金额
        int money=totalMoney%totalCount;  //余下的零头
        for (int i = 0; i < totalCount-1; i++) {
                list.add(avg); //将金额放入红包中
        }
        list.add(avg+money); //将零头放入最后一个红包当中
        return list;
    }
}
