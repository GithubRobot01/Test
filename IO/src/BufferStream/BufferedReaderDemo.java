package BufferStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//特有的成员方法:String readLine() 读取一个文本行
//返回值:包含该行内容的字符串,不包含任何行终止符,如果已到达流末尾,则返回null
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\File\\2.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
