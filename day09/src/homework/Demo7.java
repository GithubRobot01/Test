package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

/*
����ţ�1807���ڵ�ǰģ��Ŀ¼�£���һ����msg.txt���ļ���ֱ��׼���ü��ɣ������е��ı����ݱ�����һ��ѧ������Ϣ�����£�
id=heima001
name=����
age=23
school=�������Ա
ÿ����Ϣ������������=����ֵ�ĸ�ʽ��ÿ����Ϣռ��һ�С�
���̶�ȡ�ļ��е����ݣ����Ⱥ�ǰ��Ĳ�����Ϊ�����Ⱥź���Ĳ�����Ϊֵ������map�����С�
 */
public class Demo7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("day09\\msg.txt"));
        HashMap<String,String> map=new HashMap<>();
        String line;
        while ((line=br.readLine())!=null){
            String[] split = line.split("=");
            map.put(split[0],split[1]);
        }
        br.close();
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+"="+map.get(s));
        }
    }
}
