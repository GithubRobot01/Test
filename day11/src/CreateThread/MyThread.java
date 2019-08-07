package CreateThread;

public class MyThread extends Thread{
    public MyThread() {
    }
    //可以通过有参构造方法在创建多线程的时候为线程设置名字
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //通过Thread.currentThread().getName()可以获得当前执行线程的名字
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}
