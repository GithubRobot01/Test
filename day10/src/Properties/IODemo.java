package Properties;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class IODemo {
    public static void main(String[] args) throws IOException {
        Properties pro1 = new Properties();
        pro1.setProperty("����", "22");
        pro1.setProperty("����", "23");
        pro1.setProperty("����", "24");
        pro1.setProperty("����", "25");
        FileWriter fw = new FileWriter("day10\\pro.txt");
        pro1.store(fw, "�洢��Ϣ");
        FileReader fr = new FileReader("day10\\pro.txt");
        Properties pro2 = new Properties();
        pro2.load(fr);
        Set<String> set = pro2.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"="+pro2.getProperty(s));
        }
        fr.close();
        fw.close();
    }
}
