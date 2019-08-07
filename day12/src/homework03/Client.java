package homework03;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.1.100",8888);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fr=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String s;
        while (!(s=br.readLine()).equals("over")){
            fr.write(s);
            fr.newLine();
            fr.flush();
        }
        socket.shutdownOutput();
        br.close();
        socket.close();
    }
}
