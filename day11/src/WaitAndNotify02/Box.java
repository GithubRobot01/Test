package WaitAndNotify02;

public class Box{
    //定义state用来判断数据共享区是否有数据
    private boolean state=false;

    //定义取数据方法
    public synchronized void put(){
        //判断数据共享区是否有数据
        if (state){
            try {
                //有数据则进行等待,直到消费者进程取出数据进程并唤醒该进程
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //执行到此处,说明进程被唤醒(此时数据共享区无数据)
        //用输出语句模拟数据的生产过程
        System.out.println("生产者已生产出需要的数据,可以进行使用!");
        //数据生产完成,修改state,表示数据共享区有数据
        state=true;
        //唤醒消费者线程消费数据
        notifyAll();
    }

    public synchronized void get(){
        if (!state){
            try {
                //数据共享区无数据,进程等待,直到生产者线程生产数据并唤醒该进程
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //执行到此处,说明进程被唤醒(此时数据共享区有数据)
        //用输出语句模拟数据的取出过程
        System.out.println("数据已被取出使用,请尽快生产数据!");
        //数据取出,修改state,表示数据共享区无数据
        state=false;
        //唤醒生产者线程生产数据
        notifyAll();
    }
}
