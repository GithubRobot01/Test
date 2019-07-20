package FileFilter;
//File[] listFiles(FileFilter filter)
//FileFilter接口:用于抽象路径名(File对象)的过滤器 作用:用来过滤文件(File对象)
//抽象方法:accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
//File[] listFiles(FilenameFilter filter)
//interface FilenameFilter 实现此接口的类实例可用于过滤器文件名
//boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中

import java.io.File;

//以上两个接口没有实现类
public class Demo01 {
    public static void main(String[] args) {
        File f=new File("D:\\File");
        getAllJava(f);
    }
    public static void getAllJava(File dir){
        /*listFiles方法一共做了3件事:
        1.listFiles方法会传递进来的目录进行遍历,获取目录中的每一个文件/文件夹-->封装为对象
        2.listFiles方法会调用参数传递的过滤器中的方法accept
        3.listFiles方法会把遍历得到的每一个File对象,传递给pathname
         */
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File file : files) {
            if (file.isDirectory()){
                getAllJava(file);
            }else{
                //是一个文件,直接打印即可
                System.out.println(file);
            }
        }
    }
}