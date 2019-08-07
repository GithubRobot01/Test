package homework5;

public class Demo {
    public static void main(String[] args) {
        Box b=new Box();
        User u=new User(b);
        Producer p=new Producer(b);
        Thread t1=new Thread(u);
        Thread t2=new Thread(p);
        t1.start();
        t2.start();
    }
}
