package homework04;

public class Demo {
    public static void main(String[] args) {

        PrizePool pz=new PrizePool();
        Thread a=new Thread(new AThread(pz));
        Thread b=new Thread(new BThread(pz));
        a.start();
        b.start();
    }
}
