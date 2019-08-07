package Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) throws IOException{
        //根据数据源创建字节输入流对象
        FileInputStream fis=new FileInputStream("D:\\File\\mn.jpg");
        //根据目的地创建字节输出流对象
        FileOutputStream fos=new FileOutputStream("D:\\File\\mn3.jpg");

        /*
        //一次读写一个字节,读写效率较慢
        int i;
        while ((i=fis.read())!=-1){
            fos.write(i);
        }
        */

        //一次读取一个字节数组，并把读取到的数组写入
        int len=-1;
        byte[] bytes=new byte[1024];

        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //释放资源
        fis.close();
        fos.close();
    }
}
