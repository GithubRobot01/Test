package homework02;

import java.io.IOException;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Send {
    public static void main(String[] args) throws IOException {
        //设置时间格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取当前时间
                    Date d=new Date();
                    //获取当前时间的格式化
                    String time=sdf.format(d);
                    DatagramSocket ds= null;
                    try {
                        ds = new DatagramSocket();
                    } catch (SocketException e) {
                        e.printStackTrace();
                    }
                    //将格式化的时间存入字节数组
                    byte[] bytes=time.getBytes();
                    DatagramPacket dp= null;
                    try {
                        dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.1.100"),8888);
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    try {
                        ds.send(dp);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        }.start();
    }
}
