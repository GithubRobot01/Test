package homework;

import java.io.File;

public class Demo7 {
    public static void main(String[] args) {
        File f=new File("D:\\FileTest");
        delete(f);
    }
    public static void delete(File f){
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                delete(file);
            }
        }
        f.delete();
    }
}
