package homework;

public class Demo1 {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("do something...")).start();
        Runnable runnable1 = ()->System.out.println("do something...");
    }
}
