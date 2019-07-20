package OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
追加写/续写
FileOutputStream(File file, boolean append) 创建一个向指定File对象表示的文件中写入数据的文件输出流
FileOutputStream(String name, boolean append) 创建一个向具有指定name的文件中写入数据的输出文件
append:追加写开关 true:创建对象不会覆盖原文件,继续在文件末尾追加写
 */
public class Demo03 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos1=new FileOutputStream("D:\\File\\1.txt",true);
        FileOutputStream fos2=new FileOutputStream(new File("D:\\File\\2.txt"),true);
        byte[] bytes = "再见".getBytes();
        fos1.write("\r\n".getBytes()); //换行
        fos2.write("\r\n".getBytes());
        fos1.write(bytes);
        fos2.write(bytes);
        fos1.close();
        fos2.close();
    }
}
