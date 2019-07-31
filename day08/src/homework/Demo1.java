package homework;

import java.io.File;
import java.io.IOException;

/*
1、请在D:\\FileTest目录（该目录已存在）下创建一个文件java.txt
2、请在D:\\FileTest目录（该目录已存在）下创建一个文件夹javase
3、请在D:\\FileTest目录（该目录已存在）下创建一个多级目录JavaWEB\\HTML
4、请在D:\\FileTest\\heima目录（该目录不存在）下，创建一个文件hello.txt
5、请将需求1中，创建的文件java.txt删除
6、请将需求3中，创建的目录JavaWEB删除
7、请将需求4中，创建的文件hello.txt，改名为world.txt
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\FileTest\\java.txt");
        f1.createNewFile();
        File f2=new File("D:\\FileTest\\javase");
        f2.mkdir();
        File f3=new File("D:\\FileTest\\JavaWEB\\HTML");
        f3.mkdirs();
        File f4=new File("D:\\FileTest\\heima");
        f4.mkdir();
        File f5=new File("D:\\FileTest\\heima\\hello.txt");
        f5.createNewFile();
        //删除文件java.txt
        f1.delete();
        //删除Javaweb文件夹下的内容
        f3.delete();
        File f6=new File("D:\\FileTest\\JavaWEB");
        //删除Javaweb文件夹
        f6.delete();
        File f7=new File("D:\\FileTest\\heima\\world.txt");
        f5.renameTo(f7);
    }
}
