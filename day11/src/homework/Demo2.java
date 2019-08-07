package homework;

public class Demo2 {
    public static void main(String[] args) {
        Thread t1=new Thread(new RunnableImpl());
        Thread t2=new Thread(new RunnableImpl());
        t1.start();
        t2.start();
    }
}
