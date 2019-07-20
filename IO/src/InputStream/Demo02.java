package InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
int read(byte[] b) 从此输入流中将最多b.length个字节的数据读入一个byte数组中
int read(byte[] b,int off,int len) 从此输入流中将最多len个字节的数据读入一个byte数组中
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\2.txt");
        //数组的长度一般定义为1024或者1024的整数倍
        byte[] bytes=new byte[1024];
        int len=0; //记录每次读取的有效字节个数
        while ((len=fis.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));
        }
        fis.close();
    }
}
