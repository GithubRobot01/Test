package Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);

        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream os=s.getOutputStream();
        os.write("收到!".getBytes());

        s.close();
        ss.close();
    }
}
