package ThreadMethod;
//void setDaemon?(boolean on)：将此线程标记为守护线程，
// 当运行的线程都是守护线程时，Java虚拟机将退出
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t2.setName("关羽");
        t3.setName("张飞");

        //设置主线程名字
        Thread.currentThread().setName("刘备");

        //设置守护线程
        t2.setDaemon(true);
        t3.setDaemon(true);

        t2.start();
        t3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}
