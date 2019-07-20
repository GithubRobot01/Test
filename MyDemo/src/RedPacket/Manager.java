package RedPacket;

import java.util.ArrayList;

public class Manager extends User {

    public Manager(){ }

    public Manager(String name, double money) {
        super(name, money);
    }

    public ArrayList<Double> send(double totalmoney, int count) {
        ArrayList<Double> list = new ArrayList<>();
        //群主剩余金额
        double money = super.getMoney();
        if (money < totalmoney) {
            System.out.println("金额不足,无法发红包!");
            return list;
        } else {
            //发红包后剩余金额
            super.setMoney(decimal(money - totalmoney));
            //将群主发放金额转换为整数
            int totalmoney1=(int)(totalmoney*100);
            int avg = totalmoney1 / count;
            int leftmoney = totalmoney1 % count;
            for (int i = 0; i < count-1; i++) {
                    //把红包的多余金额分给随机用户
                    list.add(avg/100.0);
                }
                list.add((avg+ leftmoney)/100.0);
            }
        return list;
    }
}
