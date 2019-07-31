package BufferStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("day09\\1.txt"));
       /* int i;
        while ((i=isr.read())!=-1){
            System.out.print((char)i);
        }
        System.out.println();*/
        int len;
        char[] chars=new char[1024];
        while ((len=isr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
    }
}
