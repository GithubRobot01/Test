import java.io.File;

public class PrintJava {
    //遍历多级目录,找出.java结尾的文件
    public static void main(String[] args) {
        File f=new File("D:\\File");
        getAllJava(f);
    }
    public static void getAllJava(File dir){
//        if (dir.toString().toLowerCase().endsWith(".java")){
//            System.out.println(dir);
//        }
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                getAllJava(file);
            }else{
                if (file.toString().toLowerCase().endsWith(".java")){
                    System.out.println(file);
                }
            }
        }
    }
}
