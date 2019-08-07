package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo02 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.24.96",10086);
        OutputStream os = s.getOutputStream();
        os.write("滴,滴滴".getBytes());

        InputStream is = s.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        s.close();
    }
}
