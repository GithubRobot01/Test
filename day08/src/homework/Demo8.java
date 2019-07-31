package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\窗里窗外.txt");
        FileOutputStream fos=new FileOutputStream("day08\\窗里窗外.txt");
        int len;
        byte[] bytes=new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
    }
}
