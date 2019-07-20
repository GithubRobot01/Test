import java.io.File;

public class FileMethod02 {
//public boolean exists():此File表示的文件或目录是否实际存在
//public boolean isDirectory():此File表示的是否为目录
//public boolean isFile():此File表示的是否为文件
    public static void main(String[] args) {
        show01();
        show02();
    }
    //路径存在才可以判断
    private static void show02() {
        File f1=new File("D:\\IEDA-Workspace\\itheima\\InnerClass\\pic\\01_input.jpg");
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
    }

    //判断路径是否存在
    private static void show01() {
        File f1=new File("D:\\IEDA-Workspace\\itheima\\InnerClass\\pic\\01_input.jpg");
        System.out.println(f1.exists());
        File f2=new File("InnerClass\\pic\\01_input.jpg");
        System.out.println(f2.exists());
        System.out.println("----------------");
    }
}
