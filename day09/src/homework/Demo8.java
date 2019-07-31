package homework;

import java.io.*;
import java.util.ArrayList;

/*
����ţ�1808���ڵ�ǰģ��Ŀ¼�£���һ����maths.txt���ļ���ֱ��׼���ü��ɣ���
���е��ı��������£�
5+5
10-5
2*3
20/4
...
ÿ��һ���������ʽ��ÿ��ʽ�Ӷ���ʹ�üӼ��˳��������ӵ��������֣�û���������ݡ�
���д����ÿ��ʽ�ӵĽ�������������д������ļ��С�����ִ�к��ļ��е�����Ϊ��
5+5=10
10-5=5
2*3=6
20/4=5
...
 */
public class Demo8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("day09\\maths.txt"));
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            list1.add(line);
        }
        for (String s : list1) {
            //��¼���ŵ�λ��
            int index=-1;
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                    index=i;
                    break;
            }
        }
            StringBuilder sb=new StringBuilder();
            switch (s.charAt(index)){
                case '+':{
                    String[] split = s.split("\\+");
                    int i1 = Integer.parseInt(split[0]);
                    int i2 = Integer.parseInt(split[1]);
                    int i=i1+i2;
                    sb.append(split[0]).append("+").append(split[1]).append("=").append(i);
                    list2.add(sb.toString());
                }
                break;
                case '-':{
                    String[] split = s.split("-");
                    int i1 = Integer.parseInt(split[0]);
                    int i2 = Integer.parseInt(split[1]);
                    int i=i1-i2;
                    sb.append(split[0]).append("-").append(split[1]).append("=").append(i);
                    list2.add(sb.toString());
                }
                break;
                case '*':{
                    String[] split = s.split("\\*");
                    int i1 = Integer.parseInt(split[0]);
                    int i2 = Integer.parseInt(split[1]);
                    int i=i1*i2;
                    sb.append(split[0]).append("*").append(split[1]).append("=").append(i);
                    list2.add(sb.toString());
                }
                break;
                case '/':{
                    String[] split = s.split("/");
                    int i1 = Integer.parseInt(split[0]);
                    int i2 = Integer.parseInt(split[1]);
                    int i=i1/i2;
                    sb.append(split[0]).append("/").append(split[1]).append("=").append(i);
                    list2.add(sb.toString());
                }
                break;
            }
        }
        br.close();
        BufferedWriter bw=new BufferedWriter(new FileWriter("day09\\maths.txt"));
        for (String s : list2) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.flush();
    }
}
