package CreateThread;

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}
