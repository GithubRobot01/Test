package BufferStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
BufferWriter(字符缓冲输出流) extends Writer
特有的成员方法:void newLine() 写入一个行分隔符
 */
public class BufferWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\File\\2.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        char[] a={'奔','跑','吧'};
        bw.write(a);
        bw.write("加油!");
        bw.newLine();
        bw.write("你可以的!");
        bw.close();
    }
}
