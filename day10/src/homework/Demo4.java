package homework;

import java.io.*;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\iotest.txt"));
        PrintWriter pw=new PrintWriter("day10\\iotest.txt");
        String line;
        int num=1;
        while ((line= br.readLine())!=null){
            pw.println(num+++":"+line);
        }
        pw.close();
    }
}
