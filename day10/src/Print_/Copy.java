package Print_;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("day10\\ps.txt"));
        PrintWriter pw=new PrintWriter(new PrintStream("day10\\copy.txt"));
        String line;
        while ((line=br.readLine())!=null){
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
