package homework6;

public class Customer implements Runnable{
    private Store store;

    public Customer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            store.get();
        }
    }
}
