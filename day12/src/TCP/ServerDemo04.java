package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo04 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        Socket s = ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw=new BufferedWriter(new FileWriter("day12\\s.txt"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        PrintWriter pw=new PrintWriter(s.getOutputStream());
        pw.println("圣旨已收到!");

        pw.close();
        bw.close();
        ss.close();
    }
}
