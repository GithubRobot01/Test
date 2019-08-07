package WaitAndNotify03;

public class Demo {
    public static void main(String[] args) {
        Object obj=new Object();
        //吃货线程
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("吃货已就位,请尽快生产包子");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("吃货正在吃包子...");
                        System.out.println("---------");
                    }
                }
            }
        }.start();

        //包子铺线程
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        try {
                            for (int i = 5; i >0; i--) {
                                System.out.println("包子还有" + i + "秒蒸熟");
                                Thread.sleep(1000);
                            }

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子可以吃了!");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
