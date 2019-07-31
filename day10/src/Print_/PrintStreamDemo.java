package Print_;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps=new PrintStream("day10\\ps.txt");
        ps.print(100);
        ps.println(000);
        ps.print("hehe");
        ps.println(66.66);
        ps.close();
    }
}
