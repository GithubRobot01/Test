package ThreadImpl;
//创建线程的第三种方式
public class Thread03 {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            public void run(){
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }).start();
    }
}
