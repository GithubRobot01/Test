package homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
��׺Ϊproperties���ļ���һ�������ļ��������ļ���key=value�ĸ�ʽ�洢���ݣ�
����ʹ��Properties������ȡ����ļ���Properties���Ա��浽���л�����м��ء�
��֪�ڵ�ǰģ��Ŀ¼�£���һ��user.properties�ļ���ֱ��׼���ü��ɣ����������£�
username=heima001
passworld=123456
url=http://www.itheima.com
subjectName=javaee
���д���򣬽��ļ��е������Լ�ֵ�Ե���ʽ�洢��Properties�����У��������鿴�����
 */
public class Demo6 {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();
        /*pro.setProperty("username","heima001");
        pro.setProperty("passworld","123456");
        pro.setProperty("url","http://www.itheima.com");
        pro.setProperty("subjectName","javaee");
        pro.store(new FileWriter("day10\\user.properties"),null);*/
        pro.load(new FileReader("day10\\user.properties"));
        Set<String> set = pro.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"="+pro.getProperty(s));
        }
    }
}
