package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
解决线程安全问题的第三种方案:使用Lock锁
java.util.concurrent.locks.Lock接口
Lock锁实现提供了比使用Synchronized方法和语句可获得的更广泛的锁定操作
Lock接口中的方法:
    void lock() 获取锁
    void unlock() 释放锁
java.util.concurrent.locks.ReentrantLock implement Lock接口
使用步骤:
    1.在成员位置创建一个ReentrantLock对象
    2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
    3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
*/
public class RunnableImpl03 implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket=100;
    //1.在成员位置创建一个ReentrantLock对象
    Lock l=new ReentrantLock();
    @Override
    public void run() {
        while(true){
            l.lock();
            //先判断票是否存在
            if (ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock(); //无论程序是否异常,都会把锁释放
                }
            }
        }
    }
}
