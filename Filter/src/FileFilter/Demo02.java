package FileFilter;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02 {
    public static void main(String[] args) {
        File f=new File("D:\\File");
        getAllJava(f);
    }
    public static void getAllJava(File dir){
       /* File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });

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