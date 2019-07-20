package ThreadSafe;

public class RunnableImpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket=100;
    @Override
    public void run() {
        while(true){
            //先判断票是否存在
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
