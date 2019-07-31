package homework;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File src=new File("D:\\FileTest");
        File dest=new File("C:\\");
        copyFolder(src,dest);
    }

    private static void copyFolder(File src, File dest) throws IOException {
        //创建目的文件对象
        File destFile=new File(dest,src.getName());
        //如果源文件是文件夹
        if (src.isDirectory()) {
            if (!destFile.exists()){
                destFile.mkdir();
            }
            //获取文件夹中的所有文件
            File[] files = src.listFiles();
            for (File srcfile : files) {
                //递归调用
                copyFolder(srcfile,destFile);
            }
        } else {
            //源文件是文件,直接复制即可
            copyFile(src,destFile);
        }
    }

    public static void copyFile(File srcfile, File destFile) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcfile));
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
