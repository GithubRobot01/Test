package DiGui;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f=new File("D:\\File");
        delFile(f);
    }

    private static void delFile(File f) {
        File[] files = f.listFiles();
        if (files!=null){
            for (File file:files) {
                if (file.isDirectory()){
                    //如果是文件,首先使用递归删除文件夹中的文件,然后删除文件夹
                    delFile(file);
                    file.delete();
                }else{
                    //不是文件夹直接删除即可
                    file.delete();
                }
            }
        }
        //f.delete();
    }
}
