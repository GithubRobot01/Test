package ThreadMethod;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.setName("康熙");
        t2.setName("四阿哥");
        t3.setName("八阿哥");
        //void join()：等待这个线程死亡
        t1.start();
        //只有在线程1执行完之后,线程2、3才开始执行
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
