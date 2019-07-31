package homework;

import java.io.*;

/*
请定义一个方法实现，给出文件的数据源和拷贝目的地（均为字符串类型），
能够完成文件的拷贝，并且方法不能抛出异常。
 */
public class Demo3 {
    public static void main(String[] args) {
        copyFile("D:\\File\\1.txt","D:\\File\\2.txt");
    }
    public static void copyFile(String srcfile, String destFile){
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcfile));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));){
            int len;
            byte[] bytes=new byte[1024];
            while ((len=bis.read(bytes))!=-1) {
                bos.write(bytes, 0, len);
            }
        }catch (IOException e){

        }
    }
}
