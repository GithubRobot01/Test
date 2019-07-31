package Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\1.txt");
        FileOutputStream fos=new FileOutputStream("D:\\File\\2.txt");
        int i;
        while ((i=fis.read())!=-1){
            fos.write(i);
        }
        fis.close();
        fos.close();
    }
}
