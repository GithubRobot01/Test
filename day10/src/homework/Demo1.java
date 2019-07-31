package homework;

import java.io.*;

/*
我们可以使用IO流读取和写入数据，来完成文件的复制操作，但IO流是不可以直接操作文件夹的，
新文件夹需要通过File类的API进行创建。
现在D盘下的FileTest文件夹下，有若干文件（不包含子文件夹），请将该文件夹整体拷贝到E盘目录下。
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        File src=new File("D:\\FileTest");
        File dest=new File("E:\\",src.getName());
        if (!dest.exists()){
            dest.mkdir();
        }
        File[] files = src.listFiles();
        for (File srcfile : files) {
            File destFile=new File(dest,srcfile.getName());
            copyFile(srcfile,destFile);
        }

    }
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
