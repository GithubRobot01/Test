package Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
load(InputStream inStream) 从输入流中读取属性列表(键和元素对)
load(Reader reader) 按简单的面向行的格式从输入字符流中读取属性列表(键和元素对)

1.存储键值对的文件中,键与值默认的连接符号可以使用=,空格(其他符号)
2.存储键值对的文件中,可以使用#进行注释,被注释的键值对不会再被读取
3.存储键值对的文件中,键与值默认都是字符串,不用再加引号
*/
public class LoadDemo {
    public static void main(String[] args) throws IOException {
        Properties pro= new Properties();
        pro.load(new FileReader("D:\\File\\1.txt"));
        Set<String> set = pro.stringPropertyNames();
        for (String s : set) {
            String value = pro.getProperty(s);
            System.out.println(s+","+value);
        }
    }

}
