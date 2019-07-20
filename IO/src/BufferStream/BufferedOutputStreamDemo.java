package BufferStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
BufferedOutputStream(字节缓冲输出流) extends OutputStream

BufferedOutputStream(OutputStream out)
创建一个新的缓冲输出流,以将数据写入指定的底层输出流。
BufferedOutputStream(OutputStream out, int size)
创建一个新的缓冲输出流,以将具有指定缓冲区大小的数据写入指定的底层输出流
参数 OutputStream out:字节输出流
我们可以传递FileOutputStream,缓冲流会给FileOutputStream增加一个缓冲区,提高FileOutputStream的写入效率
size:缓冲流内部缓冲区的大小

使用步骤:
1.创建FileOutputStream对象,构造方法中绑定要输出的目的地
2.创建BufferOutputStream对象,构造方法中传递FileOutputStream对象,提高FileOutputStream对象效率
3.使用BufferOutputStream对象中的方法write,把数据写入到内部缓冲区中
4.使用BufferOutputStream对象中的方法flush,把内部缓冲区的数据刷新到文件中
5.释放资源(会先调用flush方法刷新数据,第4步可以省略)
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\File\\2.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        bos.write("把数据写入缓冲区中".getBytes());
        bos.close();
    }
}
