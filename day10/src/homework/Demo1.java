package homework;

import java.io.*;

/*
���ǿ���ʹ��IO����ȡ��д�����ݣ�������ļ��ĸ��Ʋ�������IO���ǲ�����ֱ�Ӳ����ļ��еģ�
���ļ�����Ҫͨ��File���API���д�����
����D���µ�FileTest�ļ����£��������ļ������������ļ��У����뽫���ļ������忽����E��Ŀ¼�¡�
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        File src=new File("D:\\FileTest");
        File dest=new File("E:\\",src.getName());
        if (!dest.exists()){
            dest.mkdir();
        }
        File[] files = src.listFiles();
        for (File srcfile : files) {
            File destFile=new File(dest,srcfile.getName());
            copyFile(srcfile,destFile);
        }

    }
    private static void copyFile(File file, File destFile) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
