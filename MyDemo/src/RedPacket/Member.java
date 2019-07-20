package RedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member(){ }
    public Member(String name,double money){
        super(name,money);
    }
    public void receive(ArrayList<Double> list){
            double getred;  //用来存储集合中红包的金额
            if(list.size()==0)
            {
                getred=0.0;
            }else{
                //根据索引,从集合删除,并且得到被删除的红包
                int index = new Random().nextInt(list.size());
                getred = list.remove(index);
            }
            double money = decimal(getMoney() + getred);
            setMoney(money);
    }
}
