package ChangeStream;

import java.io.*;

/*
将GBk编码的文本文件转换为UTF-8编码的文本文件
 */
public class ChangeFileForm {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\File\\4.txt"),"GBK");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\File\\5.txt"),"utf-8");
        int len=0;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
