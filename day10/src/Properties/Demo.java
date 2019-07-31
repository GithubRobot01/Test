package Properties;

import java.util.Properties;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Properties pro=new Properties();
        pro.setProperty("a","1");
        pro.setProperty("b","2");
        pro.setProperty("c","3");
        pro.setProperty("a","4");
        Set<String> set = pro.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"="+pro.getProperty(s));
        }
    }
}
