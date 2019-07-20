package OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
void close():关闭此输出流并释放与此流相关联的任何系统资源
void flush():刷新此输出流并强制任何缓冲的输出字节被写出
abstract void write(int b):将指定的字节输出流

FileOutputStream(文件字节输出流) extends OutputStream(字节输出流)
文件输出流是用于将数据写入File或FileDescriptor的输出流

构造方法:
FileOutputStream(File file) 创建一个向指定File对象表示的文件中写入数据的文件输出流
FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流
作用:1.创建一个FileOutputStream对象
     2.会根据构造方法中传递的文件/文件路径,创建一个空的文件夹
     3.会把FileOutputStream对象指向创建好的文件
写入数据的原理(内存-->硬盘)
java程序->JVM->OS->OS调用写数据的方法->把数据写到文件中

字节输出流的使用步骤(重点):
    1.创建一个FileOutputStream对象,构造方法中传递写入数据的目的地
    2.调用FileOutputStream对象中的方法write,把数据写入到文件中
    3.释放资源(使用会占用内存,使用完毕要释放资源)
*/
public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\File\\2.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
