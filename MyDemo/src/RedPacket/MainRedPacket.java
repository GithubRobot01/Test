package RedPacket;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager qunzhu = new Manager("文杰", 100);
        Member member1 = new Member("小A", 0);
        Member member2 = new Member("小B", 0);
        Member member3 = new Member("小C", 0);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入红包金额:");
            double money = sc.nextDouble();
            System.out.println("请输入红包个数:");
            int count = sc.nextInt();
            System.out.println("发红包前所有人的金额如下:");
            qunzhu.show();
            member1.show();
            member2.show();
            member3.show();
            //把群主发的红包存到集合中
            ArrayList<Double> list = qunzhu.send(money, count);
            member1.receive(list);
            member2.receive(list);
            member3.receive(list);
            System.out.println("--------");
            if (qunzhu.getMoney()>=money) {
                System.out.println("发红包后所有人的金额如下:");
                qunzhu.show();
                member1.show();
                member2.show();
                member3.show();
            }
            if (qunzhu.getMoney() == 0) {
                System.out.println("群主的红包已发完,求放过!");
                System.exit(0);
            }
        }
    }

}
