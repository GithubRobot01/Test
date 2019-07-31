package Introduce;

import java.io.File;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        File f=new File("day08\\java.txt");
        f.createNewFile();
        f.delete();
        File f1=new File("day08\\java");
        f1.mkdir();
        f1.delete();
        File f2=new File("day08\\java");
        f2.mkdir();
        File f3=new File("day08\\java\\javaee.txt");
        f3.createNewFile();
        //目录中无内容才能删除成功
        f3.delete();
        f2.delete();
    }
}
