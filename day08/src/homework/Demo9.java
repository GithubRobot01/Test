package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\itcast\\mn.jpg");
        FileOutputStream fos=new FileOutputStream("day08\\mn.jpg");
        int len;
        byte[] bytes=new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
    }
}
