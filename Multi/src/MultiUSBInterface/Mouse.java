package MultiUSBInterface;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("成功连接鼠标");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标连接");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
