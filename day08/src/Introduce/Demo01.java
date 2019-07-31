package Introduce;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\File\\java.txt");
        System.out.println(f1.createNewFile());
        File f2=new File("D:\\File","javase.txt");
        System.out.println(f2.createNewFile());
        File f3=new File("D:\\File");
        File f4=new File(f3,"javaee.txt");
        System.out.println(f4.createNewFile());

    }
}
