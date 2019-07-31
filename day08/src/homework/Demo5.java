package homework;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        File f=new File("E:\\itcast");
        getAllFile(f);
    }
    public static void getAllFile(File f){
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
                System.out.println(file.getAbsolutePath());
            }else {
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
