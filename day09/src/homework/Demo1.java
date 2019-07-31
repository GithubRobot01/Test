package homework;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\mn.jpg");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("day09\\mn.jpg");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int i;
        while ((i=bis.read())!=-1){
            bos.write(i);
        }
        bis.close();
        bos.close();
    }
}
