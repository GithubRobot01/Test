package homework;

import java.io.*;

/*
�붨��һ������ʵ�֣������ļ�������Դ�Ϳ���Ŀ�ĵأ���Ϊ�ַ������ͣ���
�ܹ�����ļ��Ŀ��������ҷ��������׳��쳣��
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
