package Lock;

import Synchronized.RunnableImpl01;

//模拟买票案例
//创建3个线程,同时开启,对共享的票进行出售
public class Ticket03 {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl03 r=new RunnableImpl03();
        //创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread t0=new Thread(r);
        Thread t1=new Thread(r); //创建一个实现类,以共享票源
        Thread t2=new Thread(r);
        //调用start方法,开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
