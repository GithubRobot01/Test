package CopyFile;

import java.io.*;

public class CopyDirs {
    public static void main(String[] args) throws IOException{
        File src=new File("D:\\File");
        File dest=new File("C:\\");
        copyFolder(src,dest);
    }

    private static void copyFolder(File src, File dest) throws IOException{
        if (src.isDirectory()){
            //获取目的地文件夹名字
            File destPath=new File(dest,src.getName());
            if (!destPath.exists()){
                destPath.mkdir();
            }
            File[] files = src.listFiles();
            for (File file : files) {
                copyFolder(file,destPath);
            }

        }else {
            copyFile(src,new File(dest,src.getName()));
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
