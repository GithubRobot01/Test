package homework03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        BufferedReader fr=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s;
        while ((s=fr.readLine())!=null){
            String add = socket.getInetAddress().getHostAddress();
            System.out.println(add+" 说： "+s);
        }
        serverSocket.close();
    }
}
