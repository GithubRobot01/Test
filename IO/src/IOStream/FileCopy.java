package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Pictures\\zy.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\File\\1.jpg");
        //效率太低
        /*int len=0;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }*/

        byte[] bytes=new byte[1024];
        int len=0;
        long start=System.currentTimeMillis();
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        //释放资源,先关闭写资源
        fos.close();
        fis.close();
        long end=System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(end-start)+"毫秒");
    }
}
