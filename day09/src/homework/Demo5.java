package homework;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("day09\\name.txt"));
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Lucy");
        list.add("Lily");
        list.add("John");
        list.add("Kevin");
        for (String s : list) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
