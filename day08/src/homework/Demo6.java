package homework;

import java.io.File;

public class Demo6 {
    public static void main(String[] args) {
        File f=new File("D:\\itcast");
        System.out.println(getSize(f));
    }
    public static long getSize(File f) {
        long size=0;
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                size+= getSize(file);
            } else {
                size+= file.length();
            }
        }
        return size;
    }
}
