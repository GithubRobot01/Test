package FileFilter;

import java.io.File;
import java.io.FilenameFilter;

public class Demo03_Lambda {
    public static void main(String[] args) {
        File f=new File("D:\\File");
        getAllJava(f);
    }
    public static void getAllJava(File dir){
File[] files = dir.listFiles((pathname) ->pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java"));
//File[] files = dir.listFiles((File dir1, String name) -> {return new File(dir1,name).isDirectory()||name.toLowerCase().endsWith(".java"); });
//File[] files = dir.listFiles((dir1,name) -> new File(dir1,name).isDirectory()||name.toLowerCase().endsWith(".java"));
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
