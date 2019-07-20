package homework_09;

public class Demo8 {
    public static void main(String[] args) {
        SmartPhone o = new SmartPhone("大米", 2000);
        System.out.println("品牌：" + o.getBrand() + ",价格：" + o.getPrice() + ",尺寸：" + SmartPhone.size);
        o.call();
        o.sendMessage();
    }
}