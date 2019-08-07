package homework04;

import java.io.*;
import java.net.Socket;

/*
请编写程序，分别模拟使用TCP协议传输数据的客户端和服务器端，
客户端获取键盘录入的文本数据发送给服务器端，服务器端获取数据后，
将文本数据反转，然后反馈给客户端，
客户端将反转后的数据打印到控制台。 客户端控制台显示的运行效果如下：
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.1.100",8888);
        //用来接收系统输入
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //用来写入服务器端
        BufferedWriter fr=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //用来接收服务器端的反馈
        BufferedReader br2=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s;
        while (true){
            System.out.println("请输入一段文本：");
            if (((s=br.readLine()).equals("over"))){
                System.out.println("结束访问");
                break;
            }
            fr.write(s);
            fr.newLine();
            fr.flush();

            System.out.println("服务器返回："+br2.readLine());
        }

        socket.shutdownOutput();
        br.close();
        socket.close();

    }
}
