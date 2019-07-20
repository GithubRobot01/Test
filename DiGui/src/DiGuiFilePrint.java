import java.io.File;

public class DiGuiFilePrint {
    //使用递归打印多级目录
    public static void main(String[] args) {
        File f=new File("D:\\File");
        getAllFile(f);
    }
    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                System.out.println("文件名:"+dir);
                getAllFile(f);
            }else{
                System.out.println("目录名:"+f);
            }
        }
    }
}
