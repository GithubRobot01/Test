package Properties;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
store(OutputStream out,String comments)
字节输出流,不能写入中文
store(Writer writer,String comments)
字符输出流,可以写入字符
String comments:注释,用来解释说明保存的文件作用,不能使用中文,一般使用""(空字符串)
*/
/*
1.创建Properties集合,添加数据
2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
3.使用properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
4.释放资源
 */
public class StoreDemo {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();
        pro.setProperty("张三","176");
        pro.setProperty("李四","174");
        pro.setProperty("王五","179");
        pro.setProperty("赵六","180");

        FileWriter fw=new FileWriter("D:\\File\\1.txt");

        pro.store(fw,"Save Data");
        fw.close();
    }
}
