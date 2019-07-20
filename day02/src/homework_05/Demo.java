package homework_05;

public class Demo {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.startUp();
        USB m=new Mouse();
        l.useUSB(m);
        USB k=new KeyBoard();
        l.useUSB(k);
        l.shutDown();
    }
}
