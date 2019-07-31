package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\File\\字符流和字节流.txt"));
        StringBuilder sb=new StringBuilder();
        int i;
        while ((i=isr.read())!=-1){
            sb.append((char)i);
        }
        System.out.println(sb.toString());
        isr.close();
    }
}
