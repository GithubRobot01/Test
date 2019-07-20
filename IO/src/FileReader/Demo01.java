package FileReader;

import java.io.FileReader;
import java.io.IOException;

/*
int read() 读取单个字符
int read(char[] cbuf) 将字符读入数组
构造方法:
FileReader(File file) 在给定从中读取数据的File的情况下创建一个新FileReader
FileReader(String fileName) 在给定从中读取数据的文件名的情况下创建一个新FileReader
*/
public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\File\\1.txt");
       /*int len=0;
        while ((len=fr.read())!=-1){
            System.out.print((char)len);
        }
*/
        char[] cs=new char[1024];
        int len=0;
        while ((len=fr.read(cs))!=-1){
            System.out.print(new String(cs,0,len));
        }

        fr.close();
    }
}
