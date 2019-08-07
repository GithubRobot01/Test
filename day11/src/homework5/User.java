package homework5;

public class User implements Runnable{
    private Box b;

    public User(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true){
            b.get();
        }
    }
}
