package Synchronized;
/*
解决线程安全问题的第一种方案:使用同步代码块
格式:
    synchronized(锁对象){
        可能会出现线程安全问题的代码(访问了共享数据的代码)
    }
注意:
    1.通过代码块的锁对象,可以使用任意的对象
    2.但是必须保证多个线程使用的锁对象是同一个
    3.锁对象作用:
        把同步代码块锁住,只让一个线程在同步代码块中执行
*/
public class RunnableImpl01 implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket=100;
    //创建一个锁对象
    Object obj=new Object();

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (obj){
                //先判断票是否存在
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                }
            }
        }
    }
}
