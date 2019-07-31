package Introduce;

import java.io.File;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\File\\java.txt");
        f1.createNewFile();
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println("-----------");
        File f2=new File("D:\\File");
        String[] list = f2.list();
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("--------");
        File[] files = f2.listFiles();
        for (File file : files) {
            //System.out.println(file);
            if (file.isDirectory())
                System.out.println(file.getName());
        }
    }
}
