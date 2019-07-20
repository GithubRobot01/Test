package Lambda;

public class Demo01 {
    public static void main(String[] args) {
        //使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
            }
        }).start();
        //使用lambda表达式实现多线程
//        前面的一对小括号即run方法的参数(无),代表不需要任何条件
//        中间的一个箭头代表将前面的参数传递给后面的代码；
//        后面的输出语句即业务逻辑代码
        new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
            }
        ).start();
    }
}
