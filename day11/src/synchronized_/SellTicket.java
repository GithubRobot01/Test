package synchronized_;

public class SellTicket implements Runnable{
    private static int ticket=100;
    private Object obj=new Object();
    private int x=0;
    @Override
    public void run() {
       while (true){
           if (x%2==0){
               //synchronized (obj){
               synchronized (SellTicket.class){
                   if (ticket>0){
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                       ticket--;
                   }
               }
           }else {
               sellTicket();
           }
           x++;
       }
    }
    //锁对象使用this,没有static
    /*public synchronized void sellTicket(){
        if (ticket>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
            ticket--;
        }
    }*/
    //锁对象使用SellTicket.class
    public static synchronized void sellTicket(){
        if (ticket>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
