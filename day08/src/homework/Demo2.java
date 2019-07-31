package homework;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        File f1=new File("D:\\FileTest");
        String[] list = f1.list();
        for (String s : list) {
            if (s.endsWith(".java")){
                System.out.println(s);
            }
        }
    }
}
