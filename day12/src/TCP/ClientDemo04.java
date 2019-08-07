package TCP;

import java.io.*;
import java.net.Socket;

public class ClientDemo04 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.24.48",8888);
        BufferedReader br=new BufferedReader(new FileReader("day12\\s.txt"));
        PrintWriter pr=new PrintWriter(s.getOutputStream(),true);
        String line;
        while ((line=br.readLine())!=null){
            pr.println(line);
        }
        //告知服务器端已写完
        s.shutdownOutput();

        BufferedReader brclient=new BufferedReader(new InputStreamReader(s.getInputStream()));
        //接收服务器的反馈
        String fk=brclient.readLine();
        System.out.println("服务器的反馈:"+fk);

        br.close();
        s.close();
    }
}
