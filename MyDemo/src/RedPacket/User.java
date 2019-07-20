package RedPacket;

public class User {
    private String name;
    private double money;

    public User(){ }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void show(){
        System.out.println("姓名:"+name+",剩余的金额"+money);
    }

    //该方法用于解决double精度丢失问题
    public double decimal(double a){
        double b=Math.round(a*100)*1.0/100;
        return b;
    }

}
