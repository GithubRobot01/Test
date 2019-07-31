package homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        String str = "流是一组有顺序的，有起点和终点的字节集合，是对数据传输的总称或抽象。即数据在两设备间的传输称为流，流的本质是数据传输，根据数据传输特性将流抽象为各种类，方便更直观的进行数据操作。";
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\IO流概念.txt"));
        osw.write(str);
        osw.close();
    }
}
