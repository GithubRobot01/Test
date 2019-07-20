import java.io.File;
import java.io.IOException;

public class FileMethod03 {
//public boolean createNewFile():当且仅当具有该名称的文件尚不存在时,创建一个新的空文件
//public boolean delete():删除由此File表示的文件或目录
//public boolean mkdir():创建由此File表示的目录 
//public boolean mkdirs():创建由此File表示的目录,包括任何必需但不存在的父目录
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
    }
    //删除成功返回true,文件夹有内容,不会删除返回false,路径不存在返回false
    private static void show03() {
        File f1=new File("D:\\File\\新建");
        System.out.println(f1.delete());
    }

    //mkdir创建单级文件夹,mkdir既可以创建单级也可以创建多级文件夹
    //文件夹不存在,创建文件夹,返回true,文件夹存在,不会创建,返回false,路径不存在返回false
    private static void show02() {
        File f1=new File("D:\\File\\新建");
        System.out.println(f1.mkdir());
        File f2=new File("D:\\File\\111\\222\\333");
        System.out.println(f2.mkdirs());
    }

    //文件不存在返回true,存在返回false,
    //此方法只能创建文件不能创建文件夹
    //创建文件夹的路径必须存在,否则会抛出异常
    private static void show01() throws IOException {
        //绝对路径和相对路径都可以
        File f1=new File("D:\\File\\1.txt");
        System.out.println(f1.createNewFile());
        //创建的是文件,而不是文件夹
        File f2=new File("D:\\File\\新建文件夹");
        System.out.println(f2.createNewFile());
    }
}
