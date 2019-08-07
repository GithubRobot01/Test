package homework04_2;

public class Demo {
    public static void main(String[] args) {
        Pool p=new Pool();

        PoolThread pt1=new PoolThread(p);
//        PoolThread pt2=new PoolThread(p);

        Thread t1=new Thread(pt1,"甲");
        Thread t2=new Thread(pt1,"乙");

        t1.start();
        t2.start();
    }
}
