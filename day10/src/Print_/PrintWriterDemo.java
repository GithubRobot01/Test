package Print_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter("day10\\pw.txt");
        pw.println("e2ughj,ds");
        pw.println(1235);
        pw.println(66.66);
        pw.println(111);
        pw.close();
    }
}
