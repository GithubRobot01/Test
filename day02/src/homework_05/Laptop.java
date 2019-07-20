package homework_05;

public class Laptop {
    public void startUp(){
        System.out.println("笔记本开机");
    }
    public void shutDown(){
        System.out.println("笔记本关机");
    }

    public void useUSB(USB usb){
        //if(usb instanceof Mouse){
          //  Mouse m = (Mouse) usb;
            usb.open();
            usb.close();
       // }else if(usb instanceof KeyBoard){
         //   KeyBoard k = (KeyBoard) usb;
         //   k.open();
          //  k.close();
       // }
    }
}
