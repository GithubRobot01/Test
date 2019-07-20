package WaitAndNotify;

/*
等待唤醒机制:
    创建一个顾客线程(消费者):告知老板需要的包子类型,调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
    创建一个老板线程(生产者):花费5秒做包子,做好包子之后,调用notify方法,唤醒顾客吃包子
注意:
    顾客和老板线程必须使用同步代码块包裹起来,保证等待和唤醒只能有一个在执行
    同步使用的锁对象唯一
    只有锁对象才能调用wait和notify方法
Object类中的方法
void wait()
    在其他线程调用此对象的notify()方法或notifyAll()方法前,导致当前线程等待。
void notify()
     唤醒在此对象监视器上等待的单个线程。
     会继续执行wait方法之后的代码
 */
public class Demo {
    public static void main(String[] args) {
        //创建锁对象,保证唯一
        Object obj = new Object();
        //创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run(){
                while(true){
                    //保证等待和唤醒的线程只有一个执行,需要使用同步技术
                    synchronized (obj){
                        System.out.println("告诉老板需要的包子类型");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("可以开始吃了");
                        System.out.println("-------------");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
               while (true){
                   //花5秒做包子
                   try {
                       for (int i = 5; i >0; i--) {
                           System.out.println("请等待"+i+"秒");
                           Thread.sleep(1000);
                       }

                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (obj){
                       System.out.println("包子新鲜出炉!");
                       //做好后,调用notify方法,唤醒顾客吃包子
                       obj.notify();
                   }
               }
            }
        }.start();
    }
}
