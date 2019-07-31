package BufferStream;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("day09\\1.txt"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("day09\\2.txt"));
        /*int i;
        while ((i=isr.read())!=-1){
            osw.write(i);
        }*/
        int len;
        char[] chars=new char[1024];
        while ((len=isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }
        isr.close();
        osw.close();
    }
}
