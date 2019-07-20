package SynchronizedMethod;
/*
解决线程安全问题的第二种方案:使用同步方法
步骤:
    1.把访问了共享数据的代码抽取出来,放在一个方法中
    2.在方法上添加synchronized修饰符
格式:定义方法的格式
    修饰符 synchronized 返回值类型 方法名(参数列表){
        可能会出现线程安全问题的代码(访问了共享数据的代码)
    }
*/
public class RunnableImpl02 implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket=100;
    //创建一个锁对象
    Object obj=new Object();

    @Override
    public void run() {
        while(true){
            payTicket();
        }
    }
    public synchronized void payTicket(){
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
