package homework01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(8888);
        while (true){
            byte[] bytes=new byte[1024];
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
            ds.receive(dp);
            InetAddress inetAddress = dp.getAddress();
            String host = "未知IP";
            if (inetAddress != null) {
                host = inetAddress.getHostAddress();
            }
            System.out.println(host+" 说: "+new String(dp.getData(),0,dp.getLength()));
        }
    }
}
