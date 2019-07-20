package MultiUSBInterface;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();

        USB mouse=new Mouse();
        computer.usbDevice(mouse);

        KeyBoard key=new KeyBoard();
        computer.usbDevice(key);

        computer.powerOff();
    }
}
