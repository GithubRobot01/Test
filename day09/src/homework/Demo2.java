package homework;

import java.io.*;

/*
��ʹ�û�������D���µ�ĳ����Ƶ������Ƶ�ļ�����������ǰģ��Ŀ¼�£�
�����㿽���������ĵ�ʱ�䣬��ʱ�䣨��λ���룩��ӡ������̨��
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\File\\movie.avi");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("day09\\movie.avi");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        long start=System.currentTimeMillis();
        int i;
        while ((i=bis.read())!=-1){
            bos.write(i);
        }
        bis.close();
        bos.close();
        long end=System.currentTimeMillis();
        System.out.println("�����������ĵ�ʱ��Ϊ:"+(end-start)+"����");
    }
}
