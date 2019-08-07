package homework04_2;

public class PoolThread implements Runnable{
    private Pool p;
    private int flag=1;//1表示甲,2表示乙

    public PoolThread(Pool p) {
        this.p = p;
    }

    @Override
    public void run() {
        //获取当前执行线程的名字
        String name=Thread.currentThread().getName();
        while (true){
            boolean isget; //用来判断奖池是否为空
            synchronized (this){
                if ("甲".equals(name)){
                    if (flag!=1){ //判断是否轮到甲执行
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    isget=p.get(name);
                    flag=2;
                    notifyAll();
                }else{
                    if (flag!=2){ //判断是否轮到乙执行
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    isget=p.get(name);
                    flag=1;
                    notifyAll();
                }
            }
            if (!isget){
                //返回值为false,表示列表为空
                break;
            }
        }
    }
}
