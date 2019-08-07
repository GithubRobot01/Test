package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.24.96",10086);
        OutputStream os = s.getOutputStream();
        os.write("好嗨吆".getBytes());
        s.close();
    }
}
