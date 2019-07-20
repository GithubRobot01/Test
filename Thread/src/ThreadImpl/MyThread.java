package ThreadImpl;
/*
创建多线程程序的第一种方式:创建Thread类的子类
Thread类是描述线程的类,我们想要实现多线程程序,就必须继承Thread类

获取线程名称:
1.使用Thread类中的String getName() 获取当前线程名称。
2.static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
public class MyThread extends Thread {
    public MyThread(){

    }
    public MyThread(String name){
        //调用父类的String参数的构造方法
        super(name); //把线程名称传递给父类,让父类(Thread)给子线程起一个名字
        //setName(name);
    }
    //重写Thread类中的run方法,设置线程任务
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            //String name=getName();
            //System.out.println(name+"正在执行!"+i);
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
