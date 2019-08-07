package homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(8888);
        new Thread(){
            @Override
            public void run() {
                while (true){
                    byte[] bytes=new byte[1024];
                    DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
                    try {
                        ds.receive(dp);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    InetAddress inetAddress = dp.getAddress();
                    System.out.println(inetAddress.getHostAddress()+"发送数据："+new String(dp.getData(),0,dp.getLength()));
                }
            }
        }.start();
    }
}
