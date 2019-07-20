package ThreadImpl;

/*创建多线程程序的第二种方式:实现Runnable接口
Thread类的构造方法
    Thread(RunnableImpl target) 分配新的Thread对象
    Thread(RunnableImpl target,String name) 分配新的Thread对象
实现步骤:
1.定义Runnable接口的实现类
2.重写该接口的run()方法,设置线程任务
3.创建一个Runnable接口的实现类对象
4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
Runnable实现类的实例,并以此实例作为Thread的target来创建Thread对象,该Thread对象才是真正的线程对象.
5.调用线程对象的start()方法来启动线程.*/
public class RunnableDemo {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        Thread t=new Thread(r);
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
