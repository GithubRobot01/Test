package CopyFile;

import java.io.*;

public class CopyDir {
    public static void main(String[] args) throws IOException{
        File src=new File("D:\\File");
        File dest=new File("day10",src.getName());
        //查看目的地文件夹是否存在
        if (!dest.exists()){
            dest.mkdirs();
        }
        File[] files = src.listFiles();
        for (File file : files) {
            File destFile=new File(dest,file.getName());
            copyFile(file,destFile);
        }
    }
    //字节缓冲流复制文件
    private static void copyFile(File file, File destFile) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
