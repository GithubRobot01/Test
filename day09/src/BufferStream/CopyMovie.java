package BufferStream;


import java.io.*;

public class CopyMovie {
    public static void main(String[] args) throws IOException{
        //分别计算四种方法复制视频需要的时间
        long start1=System.currentTimeMillis();
        copyMethod01();
        long end1=System.currentTimeMillis();
        System.out.println("共耗时:"+(end1-start1)+"毫秒");
        long start2=System.currentTimeMillis();
        copyMethod02();
        long end2=System.currentTimeMillis();
        System.out.println("共耗时:"+(end2-start2)+"毫秒");
        long start3=System.currentTimeMillis();
        copyMethod03();
        long end3=System.currentTimeMillis();
        System.out.println("共耗时:"+(end3-start3)+"毫秒");
        long start4=System.currentTimeMillis();
        copyMethod04();
        long end4=System.currentTimeMillis();
        System.out.println("共耗时:"+(end4-start4)+"毫秒");
    }
    //基本字节流一次读写一个字节,耗时最长
    private static void copyMethod01() throws IOException {

        FileInputStream fis=new FileInputStream("D:\\File\\movie.avi");
        FileOutputStream fos=new FileOutputStream("D:\\File\\copy01.avi");
        int i;
        while ((i=fis.read())!=-1){
            fos.write(i);
        }
        fis.close();
        fos.close();
    }
    //基本字节流一次读写一个字节数组
    private static void copyMethod02() throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\movie.avi");
        FileOutputStream fos=new FileOutputStream("D:\\File\\copy02.avi");
        int len;
        //字节数组的长度不固定,一般为1024的整数倍
        byte[] bytes=new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
    //字节缓冲流一次读写一个字节
    private static void copyMethod03() throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\movie.avi");
        FileOutputStream fos=new FileOutputStream("D:\\File\\copy03.avi");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int i;
        while ((i=bis.read())!=-1){
            bos.write(i);
        }
        bis.close();
        bos.close();
    }
    //字节缓冲流一次读写一个字节数组,耗时最短
    private static void copyMethod04() throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\movie.avi");
        FileOutputStream fos=new FileOutputStream("D:\\File\\copy04.avi");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
