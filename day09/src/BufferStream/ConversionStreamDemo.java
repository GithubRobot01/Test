package BufferStream;

import java.io.*;

/*
InputStreamWriter 是从字节流到字符流的桥梁
它读取字节,并使用指定的编码将其解码为字符

OutputStreamWriter 是字符流通向字节流的桥梁
是从字符流到字节流的桥梁,使用指定的编码将写入的字符编码为字节
 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("day09\\1.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
        osw.write("中国");
        osw.close();
        FileInputStream fis=new FileInputStream("day09\\1.txt");
        InputStreamReader isr=new InputStreamReader(fis,"GBK");
        int i;
        while ((i=isr.read())!=-1){
            System.out.print((char)i);
        }
        isr.close();
    }
}
