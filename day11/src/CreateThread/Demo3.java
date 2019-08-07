package CreateThread;

public class Demo3 {
    public static void main(String[] args) {
        //使用匿名内部类创建Thread子类对象并调用start方法
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                }
            }
        }.start();

        //使用匿名内部类创建Runnable接口的实现类对象
        //并将其作为参数传入Thread对象,开启多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                }
            }
        }).start();
    }
}
