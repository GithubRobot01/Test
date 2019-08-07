package TCP;

import java.io.*;
import java.net.Socket;

public class ClientDemo03 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.24.34",22221);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr=new PrintWriter(s.getOutputStream(),true);
        String line;
        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
            pr.println(line);
        }
        br.close();
        s.close();
    }
}
