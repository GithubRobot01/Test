package OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
void write(byte[] b):将 b.length字节从指定的字节数组写入此输出流
void write(byte[] b,int off,int len):从指定的字节数组写入len字节,从偏移量off开始输出到此输出流
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos1=new FileOutputStream("D:\\File\\1.txt");
        FileOutputStream fos2=new FileOutputStream(new File("D:\\File\\2.txt"));
        byte[] bytes={65,66,67,68};
        fos1.write(bytes);
        fos2.write(bytes);
        byte[] bytes1 = "荣耀".getBytes();
        //UTF-8编码,三个字节为一个中文
        System.out.println(Arrays.toString(bytes1));
        fos1.write(bytes1);
        fos2.write(bytes1);

        fos1.write(bytes,2,2);
        fos2.write(bytes,2,2);
        fos1.close();
        fos2.close();
    }
}
