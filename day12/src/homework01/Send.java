package homework01;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        // DatagramSocket​() 构造数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds=new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        String s;
        //键盘录入想要发送的信息,以"over"结束
        while (!(s=sc.next()).equals("over")){
            byte[] bytes=s.getBytes();
            //构造一个数据包,发送长度为length的数据包到指定主机上的指定端口号
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192.168.1.100"),8888);
            //调用DatagramSocket对象的send方法发送数据
            ds.send(dp);
        }
        //关闭发送端
        ds.close();
    }
}
