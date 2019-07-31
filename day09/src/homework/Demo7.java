package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

/*
【编号：1807】在当前模块目录下，有一个“msg.txt”文件（直接准备好即可），其中的文本内容保存了一个学生的信息，如下：
id=heima001
name=张三
age=23
school=黑马程序员
每条信息都是属性名称=属性值的格式，每条信息占据一行。
请编程读取文件中的内容，将等号前面的部分作为键，等号后面的部分作为值，存入map集合中。
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
