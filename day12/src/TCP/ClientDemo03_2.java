package TCP;

import java.io.*;
import java.net.Socket;

public class ClientDemo03_2 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.24.48",8888);
        BufferedReader br=new BufferedReader(new FileReader("day12\\s.txt"));
        PrintWriter pr=new PrintWriter(s.getOutputStream(),true);
        String line;
        while ((line=br.readLine())!=null){
            pr.println(line);
        }
        br.close();
        s.close();
    }
}
