package homework5;

public class Box {
    //用来表示牛奶的状态
    private boolean state=false;

    public synchronized void put(){
        if (state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("送奶工将牛奶放入箱子,请尽快取用!");
        state=true;
        notify();
    }
    public synchronized void get(){
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户已取出牛奶,请尽快送来!");
        state=false;
        notify();
    }
}
