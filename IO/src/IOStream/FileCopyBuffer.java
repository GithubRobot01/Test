package IOStream;

import java.io.*;

public class FileCopyBuffer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Pictures\\zy.jpg");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("D:\\File\\1.jpg");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte[] bytes=new byte[1024];
        long start=System.currentTimeMillis();
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //释放资源,先关闭写资源
        bos.close();
        bis.close();
        long end=System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(end-start)+"毫秒");
    }
}
