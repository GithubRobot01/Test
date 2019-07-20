package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
void write(char[] cbuf) 写入字符数组
abstract void write(char[] cbuf,int off,int len) 写入字符数组的某一部分
void write(String str) 写入字符串
void write(String str,int off,int len) 写入字符串的某一部分

 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\File\\3.txt");
        fw.write("2.222");
        fw.write("\r\n");
        fw.write("4.444");
        fw.write("\r\n");
        fw.write("7.777");
        fw.write("\r\n");
        fw.write("5.555");
        fw.write("\r\n");
        fw.write("3.333");
        fw.write("\r\n");
        fw.write("6.666");
        fw.write("\r\n");
        fw.write("1.111");
        fw.write("\r\n");

        fw.flush();
    }
}
