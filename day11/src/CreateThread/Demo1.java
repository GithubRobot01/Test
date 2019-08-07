package CreateThread;

public class Demo1 {
    public static void main(String[] args) {
        //通过有参构造创建多线程并设置线程名字
        MyThread t1=new MyThread("Thread");
        //通过无参构造创建多线程
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
    }
}
