package BufferStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("day09\\1.txt"));
        osw.write(97);
        osw.write(98);
        char[] c={'l','o','v','e'};
        osw.write(c);
        osw.write(c,1,2);
        osw.write("哈哈");
        osw.write("啦啦啦啦",1,2);
        osw.close();
    }
}
