package homework;

import java.io.*;
import java.util.ArrayList;

/*
【编号：1808】在当前模块目录下，有一个“maths.txt”文件（直接准备好即可），
其中的文本内容如下：
5+5
10-5
2*3
20/4
...
每行一个算术表达式，每个式子都是使用加减乘除符号连接的两个数字，没有其他数据。
请编写程序将每个式子的结果计算出来，再写回这个文件中。程序执行后，文件中的内容为：
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
            //记录符号的位置
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
