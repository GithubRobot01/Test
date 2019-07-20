package ThreadImpl;
/*
1.定义Thread类的子类,并重写该类的run()方法,该run()方法的方法体就代表了线程需要完成的任务,因此把run()方法称为线程执行体。
2.创建Thread子类的实例,即创建了线程对象
3.调用线程对象的start()方法来启动该线程
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt=new MyThread("新的线程-1");
        //调用start方法,开启新线程,执行run方法
        mt.start();
        new MyThread("新的线程-2").start();
        for (int i = 0; i < 1000; i++) {
            //Thread.currentThread().getName() 获取当前正在执行线程的名字--main
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
