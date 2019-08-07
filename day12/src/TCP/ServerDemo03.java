package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo03 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        Socket s = ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bos=new BufferedWriter(new FileWriter("day12\\s.txt"));
        String line;
        while ((line=br.readLine())!=null){
            bos.write(line);
            bos.newLine();
            bos.flush();
        }
        bos.close();
        ss.close();
    }
}
