package ThreadImpl;
//匿名内部类的作用:简化代码
//把子类继承父类,重写父类方法,创建子类对象一步完成
//把实现接口,重写接口中的方法,创建实现类对象一步完成
public class InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
            //重写run方法,设置线程任务
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->万");
                }
            }
        }.start();


        //线程的接口runnable
        //RunnableImpl r = new RunnableImpl();  多态
        Runnable r=new Runnable(){
            //重写run方法,设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->强");
                }
            }
        };
        new Thread(r).start();
        //简化
        new Thread(new Runnable(){
            //重写run方法,设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->胜");
                }
            }
        }).start();
    }
}
