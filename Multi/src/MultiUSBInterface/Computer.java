package MultiUSBInterface;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
    public void usbDevice(USB usb){
        usb.open();//打开设备
        if (usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard keyBoard=(KeyBoard) usb;
            keyBoard.type();
        }
        usb.close();//关闭设备
    }
}
