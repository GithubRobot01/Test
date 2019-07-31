package DiGui;

import java.io.File;

public class ForEachFile {
    public static void main(String[] args) {
        File f=new File("D:\\File");
        getFile(f);
    }

    public static void getFile(File f){
        File[] files = f.listFiles();
        if (files!=null){
            for (File file : files) {
                if (file.isDirectory()){
                    //System.out.println(file.getPath());
                    getFile(file);
                }else {
                    System.out.println(file.getPath());
                }
            }
        }

    }
}
