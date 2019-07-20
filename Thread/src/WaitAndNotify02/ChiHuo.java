package WaitAndNotify02;

/*
吃货(消费者)类:是一个线程类,可以继承Thread
设置线程任务(run):吃包子
对包子的状态进行判断
true:没有包子
    吃货调用wait方法进入等待状态
false:有包子
    吃货吃包子
    修改包子状态为false
    唤醒包子铺线程,生产包子
*/
public class ChiHuo extends Thread {
    //1.需要在成员位置创建一个包子变量
    private BaoZi bz;

    //使用带参构造方法,为这个包子变量赋值
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务(run):吃包子
    @Override
    public void run() {
        //让吃货一直吃包子
        while (true) {
            //必须使用同步技术保证两个线程只能有一个在执行
            synchronized (bz) {
                if (bz.flag == false) {
                    //包子铺调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行,吃货吃包子
                System.out.println("吃货正在吃" + bz.pi + bz.xian + "包子");
                //等待生产包子
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //修改包子状态
                bz.flag = false;
                //唤醒包子铺线程,生产包子
                bz.notify();
                System.out.println("吃货已经吃完了" + bz.pi + bz.xian + "包子,可以开始生产了!");
                System.out.println("=========================");
            }
        }
    }
}
