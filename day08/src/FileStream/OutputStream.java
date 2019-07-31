package FileStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\File\\java.txt",true);
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write("\r\n".getBytes());
        //byte[] bytes={100,101,102};
        byte[] bytes = "def".getBytes();
        fos.write(bytes);
        fos.write("\r\n".getBytes());
        fos.write(bytes,1,2);
        fos.write("\r\n".getBytes());
        fos.close();
    }
}
