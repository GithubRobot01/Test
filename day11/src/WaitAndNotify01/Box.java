package WaitAndNotify01;

public class Box{
    //定义成员变量,表示第x瓶奶
    private int milk;
    private boolean state=false;

    public synchronized void put(int milk){
        if (state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk=milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶箱");
        //生产牛奶后将状态改为true
        state=true;
        notifyAll();
    }

    public synchronized void get(){
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("住户拿到第"+this.milk+"瓶牛奶");
        //拿走牛奶,修改状态
        state=false;
        notifyAll();
    }
}
