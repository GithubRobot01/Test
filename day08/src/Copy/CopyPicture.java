package Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("D:\\File\\mn.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\File\\mn3.jpg");
        /*int i;
        while ((i=fis.read())!=-1){
            fos.write(i);
        }*/
        int len=-1;
        byte[] bytes=new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
