package ChangeStream;

import java.io.FileInputStream;;
import java.io.IOException;
import java.io.InputStreamReader;
/*
InputStreamReader(InputStream in)创建一个使用默认字符集的InputStreamReader
InputStreamReader(InputStream in,String charsetName)创建使用指定字符集的InputStreamReader
 构造方法中指定的编码表名称要和文件的编码相同,否则会发生乱码
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\File\\4.txt"),"GBK");
        int len=0;
        while ((len=isr.read())!=-1){
            System.out.print((char)len);
        }
        isr.close();
    }
}
