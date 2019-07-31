package BufferStream;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\File\\1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("Hello\r\n".getBytes());
        bos.write("World\r\n".getBytes());
        bos.close();

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\File\\1.txt"));
        /*int i;
        while ((i=bis.read())!=-1){
            System.out.print((char)i);
        }*/
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));
        }
        bis.close();
    }
}
