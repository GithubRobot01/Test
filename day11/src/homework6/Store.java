package homework6;

public class Store {
    //仓库容量
    private final int size=500;
    //仓库目前产品数量
    private int num=0;

    public synchronized void put(){
        if (num==size){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println("生产存入1个单位货物，现在仓库剩余"+num);
        notify();
    }

    public synchronized void get(){
        if (num==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("消费取出1个单位货物，现在仓库剩余"+num);
        notify();
    }
}
