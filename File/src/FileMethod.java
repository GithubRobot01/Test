import java.io.File;

public class FileMethod {
    //public String getAbsolutePath():返回此File的绝对路径名字符串
//public String getPath():将此File转换为路径名字符串 toString就是getPath方法
//public String getName():返回由此File表示的文件或目录的名称
//public long length():返回由此File表示的文件的长度
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    private static void show04() {
        File f1 = new File("D:\\IEDA-Workspace\\itheima\\InnerClass\\pic\\01_input.jpg");
        System.out.println(f1.length());
        File f2 = new File("D:\\IEDA-Workspace\\itheima\\InnerClass");
        System.out.println(f2.length());
    }

    private static void show03() {
        File f1 = new File("D:\\IEDA-Workspace\\itheima\\a.txt");
        System.out.println(f1.getName());
        File f2 = new File("D:\\IEDA-Workspace\\itheima");
        System.out.println(f2.getName());
        System.out.println("-------------");
    }

    private static void show02() {
        File f1 = new File("D:\\IEDA-Workspace\\itheima\\a.txt");
        System.out.println(f1.getPath());
        File f2 = new File("a.txt");
        System.out.println(f2.getPath());
        System.out.println("-----------------");
    }

    private static void show01() {
        File f = new File("a.txt");
        String abs = f.getAbsolutePath();
        //传入相对路径,返回绝对路径
        //D:\IEDA-Workspace\itheima\a.txt
        System.out.println(abs);
        System.out.println("-----------------");
    }
}
