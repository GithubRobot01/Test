package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
����֪��һ���ļ����ļ�������ģ��Ŀ¼��names.txt������洢�˰༶ͬѧ��������
ÿһ������ռһ�С����д����ʵ�������ȡ������һ��ͬѧ���������������������
 */
public class Demo6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("day09\\name.txt"));
        ArrayList<String> list=new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            list.add(line);
        }
        //System.out.println(list);
        br.close();
        String name=list.get(new Random().nextInt(list.size()));
        System.out.println(name+"��ϲ���н���");
    }
}
