import java.io.File;

public class FileMethod04 {
//public String[] list():返回一个String数组,表示该File目录中的所有子文件或目录
//public File[] listFiles():返回一个File数组,表示该File目录中的所有的子文件或目录
    public static void main(String[] args) {
        //路径不存在或路径不是目录会抛出异常
        File f1=new File("D:\\File");
        String[] list = f1.list();
        for (String fileName : list) {
            System.out.println(fileName);
        }
        System.out.println("----------------");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);

        }
    }
}
