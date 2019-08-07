package homework04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        //用来接收客户端发来的信息
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //用来给客户端反馈
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String s;
        while ((s=br.readLine())!=null){
            StringBuilder sb=new StringBuilder(s);

            bw.write(sb.reverse().toString());
            bw.newLine();
            bw.flush();
        }
        serverSocket.close();
    }
}
