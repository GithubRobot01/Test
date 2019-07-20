package InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
int read() 从此输入流中读取一个数据字节。
构造方法:
FileInputStream(File file)
通过打开一个到实际文件的连接来创建一个FileInputStream,该文件通过文件系统中的File对象file指定
FileInputStream(String name)
通过打开一个到实际文件的连接来创建一个FileInputStream,该文件通过文件系统中的路径名name指定
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\2.txt");
        //int read() 读取文件中的一个字节并返回,读取到文件的末尾返回-1
        int len;
        while ((len=fis.read())!=-1){
            System.out.print((char)len);
        }
        fis.close();
    }
}
