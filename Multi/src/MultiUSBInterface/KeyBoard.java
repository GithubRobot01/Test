package MultiUSBInterface;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("成功连接键盘");
    }

    @Override
    public void close() {
        System.out.println("断开键盘连接");
    }

    public void type(){
        System.out.println("键盘打字");
    }
}
