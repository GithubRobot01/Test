package WaitAndNotify02;

public class BoxDemo {
    public static void main(String[] args) {
        //创建Box对象,这是数据共享区
        Box b=new Box();
        //创建生产者对象,把Box对象作为构造方法的参数传递进去
        //在生产者类中要调用生产数据的操作
        Producer p=new Producer(b);
        //创建消费者对象,把Box对象作为构造方法的参数传递进去
        //在消费者类中要调用使用数据的操作
        Customer c=new Customer(b);
        //创建两个线程对象,分别把生产者对象和消费者对象作为构造方法的参数传递进去
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        //启动线程
        t1.start();
        t2.start();
    }
}
//        new Thread(new Producer(b)).start();
//        new Thread(new Customer(b)).start();