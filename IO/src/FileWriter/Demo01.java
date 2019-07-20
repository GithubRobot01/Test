package FileWriter;

import java.io.FileWriter;
import java.io.IOException;
/*
使用步骤:
1.创建FileWriter对象,构造方法中绑定要写入数据的目的地
2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
3.使用FileWrite中的方法flush,把内存缓冲区中的数据刷新到文件中
4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\File\\2.txt");
        fw.write(97);
        fw.flush();
        fw.close();
    }
}
