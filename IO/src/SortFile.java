import java.io.*;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/*
对文本内容进行排序(按照1,2,3...)
分析:
1.创建一个HashMap集合对象,key:存储每行文本的序号,value:存储每行的文本内容
2.创建字符缓冲输入流,构造方法中绑定字符输入流
3.创建字符缓冲输出流,构造方法中绑定字符输出流
4.使用字符缓冲输入流中的方法readLine,逐行读取文本
5.对读取到的文本进行切割,获取行中的序号和文本内容
6.把切割好的序号和文本内容存储到HashMap集合中(key会自动排序)
7.遍历HashMap集合,获取每一个键值对
8.把每一个键值对,拼接为一个文本行
9.把拼接好的文本,使用字符缓冲输出流中的方法write,写入到文件中
 */
public class SortFile {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map=new HashMap<>();
//        TreeMap<Integer,String> map=new TreeMap<>();
        BufferedReader br=new BufferedReader(new FileReader("D:\\File\\3.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\File\\4.txt"));
        String line=null;
        while ((line=br.readLine())!=null){
            line = line.trim(); // 去除前后端空格
            if("".equals(line)) { //去除空行
                continue;
            }
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        //   String s1 = line.charAt(0) + "";
        //   String s2 = line.substring(2);
        //   map.put(Integer.valueOf(arr[0]),arr[1]);'
        //   map.put(Integer.valueOf(s1), s2);

        }

        br.close();
        /*for (int i = 1; i <= map.size(); i++) {
            String key = String.valueOf(i);
            // 获取map中文本
             String value = map.get(key);
            // 写出拼接文本
             bw.write(key+"."+value);
            // 写出换行
             bw.newLine();
            }*/
        for (String key:map.keySet()){
            String value=map.get(key);
            line=key+"."+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }
}
