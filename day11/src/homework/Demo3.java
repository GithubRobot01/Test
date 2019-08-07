package homework;

public class Demo3 {
    public static void main(String[] args) {
        Runnable r=new Runnable(){
            private int ticket=100;
            private Object obj=new Object();
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        if (ticket>0){
                            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                            ticket--;
                        }
                    }
                }
            }
        };
        Thread t1=new Thread(r,"售票口1:");
        Thread t2=new Thread(r,"售票口2:");
        Thread t3=new Thread(r,"售票口3:");
        t1.start();
        t2.start();
        t3.start();
    }
}
