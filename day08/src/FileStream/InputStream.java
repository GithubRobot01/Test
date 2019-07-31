package FileStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fos=new FileInputStream("D:\\File\\java.txt");
        int i;
        while ((i=fos.read())!=-1){
            System.out.print((char)i);
        }
        fos.close();
    }
}
