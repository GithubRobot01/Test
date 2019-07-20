package ChangeStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
OutputStreamWriter 是字符流通向字节流的桥梁:可使用指定的charset将要写入流中的字符编码成字节
OutputStreamWriter(OutputStream out)创建使用默认字符编码的OutputStreamWriter
OutputStreamWriter(OutputStream out,String charsetName)创建使用指定字符集的OutputStreamWriter
OutputStream out:字节输出流,可以用来写转换之后的字节到文件中
String charsetName:指定的编码表名称,不区分大小写,可以使UTF-8/GBK...
*/
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\File\\4.txt"),"GBK");
        osw.write("你好!");
        osw.flush();
        osw.close();
    }
}
