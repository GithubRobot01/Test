package BufferStream;

import java.io.*;

/*
    InputStreamReader：是从字节流到字符流的桥梁
        它读取字节，并使用指定的编码将其解码为字符
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集

    OutputStreamWriter：是从字符流到字节流的桥梁
        是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("day09\\1.txt");
        //创建一个使用GBk编码的OutputStreamWriter
        OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
        osw.write(97);
        char[] c={'我','爱','你'};
        osw.write(c);
        osw.write("中国");
        osw.close();
        FileInputStream fis=new FileInputStream("day09\\1.txt");
        //创建一个使用默GBK字符集的InputStreamReader
        InputStreamReader isr=new InputStreamReader(fis,"GBK");
        //一次读取一个字符
        int i;
        while ((i=isr.read())!=-1){
            System.out.print((char)i);
        }
        isr.close();
    }
}
