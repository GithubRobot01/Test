import java.io.File;

public class FileConstructor {
    public static void main(String[] args) {
//      File(String pathname)
//      通过将给定路径名字符串转换为抽象路径名来创建一个新File实例。
        show01();
//      File(String parent,String child)
//      根据parent路径名字符串和child路径名字符串创建一个新File实例
        show02("D:\\IEDA-Workspace\\itheima\\File\\src", "FileConstructor.java");
//      File(File parent,String child)
//      根据parent抽象路径名和child路径名字符串创建一个新File实例
        File parent=new File("c:\\");
        show03(parent,"FilleDemo.java");
    }

    private static void show03(File s, String s1) {
        File f=new File(s,s1);
        System.out.println(f);
    }

    private static void show02(String s, String s1) {
        File f3=new File(s,s1);
        System.out.println(f3);
    }

    private static void show01() {
        //绝对路径
        File f1=new File("D:\\IEDA-Workspace\\itheima\\File\\src");
        System.out.println(f1);
        //相对路径
        File f2=new File("FileConstructor.java");
        System.out.println(f2);
    }
}
