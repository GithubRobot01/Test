package homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        String str = "����һ����˳��ģ��������յ���ֽڼ��ϣ��Ƕ����ݴ�����ܳƻ���󡣼����������豸��Ĵ����Ϊ�������ı��������ݴ��䣬�������ݴ������Խ�������Ϊ�����࣬�����ֱ�۵Ľ������ݲ�����";
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\IO������.txt"));
        osw.write(str);
        osw.close();
    }
}
