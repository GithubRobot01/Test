package homework05;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.1.100",8888);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个jpg图片文件的路径：");
        String path=sc.next();
        //用来读取本地图片
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(path));
        //用来传图片给服务器
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        //接收反馈
        BufferedReader fr=new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int len;
        byte[] bytes=new byte[1024];
        while ((len=bis.read(bytes))!=-1){
           bos.write(bytes,0,len);
        }
        socket.shutdownOutput();

        System.out.println(fr.readLine());
        bis.close();
        socket.close();
    }
}
