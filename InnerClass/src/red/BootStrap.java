package red;

public class BootStrap {
    public static void main(String[] args) {
        MyRed myRed=new MyRed("红包来啦!");
        myRed.setOwnerName("文杰");
//        NormalRed normal=new NormalRed();
//        myRed.setOpenWay(normal);
        RandomRed random=new RandomRed();
        myRed.setOpenWay(random);
    }
}
