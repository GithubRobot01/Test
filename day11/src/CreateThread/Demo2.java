package CreateThread;

public class Demo2 {
    public static void main(String[] args) {
        RunnableImpl r=new RunnableImpl();
        Thread t1=new Thread(r);
        t1.start();
        Thread t2=new Thread(r);
        t2.start();
    }
}
