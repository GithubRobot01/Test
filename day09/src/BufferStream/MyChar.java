package BufferStream;

import java.io.*;

public class MyChar {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\File\\1.txt"));
        //根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\File\\2.txt"));

        /*
        //一次读写一个字符数据
        int ch;
        while ((ch=br.read())!=-1) {
            bw.write(ch);
        }
        */

        /*
        //一次读写一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len=br.read(chs))!=-1) {
            bw.write(chs,0,len);
        }
        */

        //使用字符缓冲流特有方法readLine读取数据
        String line;
        while ((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
        br.close();
    }
}
