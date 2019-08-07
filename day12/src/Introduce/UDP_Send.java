package Introduce;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
/*
    UDP发送数据的步骤
        1:创建发送端的Socket对象(DatagramSocket)
        2:创建数据，并把数据打包
        3:调用DatagramSocket对象的方法发送数据
        4:关闭发送端
 */
public class UDP_Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        //byte[] bytes = "再乱说话,顺着网线打你".getBytes();
        while (true){
            System.out.println("请输入想要发送的信息:");
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            byte[] bytes = s.getBytes();
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.24.48"),10086);
            ds.send(dp);
        }
        //ds.close();
    }
}
