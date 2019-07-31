package homework;

import java.io.*;

/*
请使用缓冲流将D盘下的某个音频或者视频文件，拷贝到当前模块目录下，
并计算拷贝过程消耗的时间，将时间（单位毫秒）打印到控制台。
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\movie.avi");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("day09\\movie.avi");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        long start=System.currentTimeMillis();
        int i;
        while ((i=bis.read())!=-1){
            bos.write(i);
        }
        bis.close();
        bos.close();
        long end=System.currentTimeMillis();
        System.out.println("拷贝过程消耗的时间为:"+(end-start)+"毫秒");
    }
}
