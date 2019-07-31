package homework;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File src=new File("D:\\FileTest");
        File dest=new File("C:\\");
        copyFolder(src,dest);
    }

    private static void copyFolder(File src, File dest) throws IOException {
        //����Ŀ���ļ�����
        File destFile=new File(dest,src.getName());
        //���Դ�ļ����ļ���
        if (src.isDirectory()) {
            if (!destFile.exists()){
                destFile.mkdir();
            }
            //��ȡ�ļ����е������ļ�
            File[] files = src.listFiles();
            for (File srcfile : files) {
                //�ݹ����
                copyFolder(srcfile,destFile);
            }
        } else {
            //Դ�ļ����ļ�,ֱ�Ӹ��Ƽ���
            copyFile(src,destFile);
        }
    }

    public static void copyFile(File srcfile, File destFile) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcfile));
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
