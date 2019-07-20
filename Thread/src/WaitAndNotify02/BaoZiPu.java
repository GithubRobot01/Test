package WaitAndNotify02;
/*
包子铺(生产者)类:是一个线程类,可以继承Thread
设置线程任务(run):生产包子
对包子的状态进行判断
true:有包子
    包子铺调用wait方法进入等待状态
false:没有包子
    包子铺生产包子
    增加一些趣味性:交替生产两种包子
        有两种状态(i%2==0)
    包子铺生产好包子
    修改包子状态为true
    唤醒吃货线程吃包子
注意:
    包子铺线程和包子线程关系-->通信(互斥)
    必须使用同步技术保证两个线程只能有一个在执行
    锁对象必须保证唯一,可以使用包子对象作为参数传递过来
        1.需要在成员位置创建一个包子变量
        2.使用带参数构造方法,为这个包子变量赋值
 */
public class BaoZiPu extends Thread{
    //1.需要在成员位置创建一个包子变量
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }
    //设置线程任务(run):生产包子
    @Override
    public void run(){
        int count=0;
        //让包子铺一直生产包子
        while (true){
            //必须使用同步技术保证两个线程只能有一个在执行
            synchronized (bz){
                if (bz.flag){
                    //包子铺调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行,包子铺生产包子
                if (count%2==0){
                    bz.pi="薄皮";
                    bz.xian="韭菜鸡蛋";
                }else{
                    bz.pi="冰皮";
                    bz.xian="猪肉大葱";
                }
                count++;
                System.out.println("包子铺正在生产:"+bz.pi+bz.xian+"包子");
                //等待生产包子
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //修改包子状态
                bz.flag=true;
                //唤醒吃货线程,让吃货吃包子
                bz.notify();
                System.out.println("包子铺已经生产好了"+bz.pi+bz.xian+"包子,可以吃了!");
            }
        }
    }
}
