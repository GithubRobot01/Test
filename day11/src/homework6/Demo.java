package homework6;

public class Demo {
    public static void main(String[] args) {
        Store store=new Store();
        Customer c=new Customer(store);
        Producer p=new Producer(store);
        Thread t1=new Thread(c);
        Thread t2=new Thread(p);
        t1.start();
        t2.start();
    }
}
