package SerialStream;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
    练习：序列化集合
        当我们想在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中
        对集合进序列化和反序列化
    分析:
        1.定义一个存储Person对象的ArrayList集合
        2.往ArrayList集合中存储Person对象
        3.创建一个序列化流ObjectOutputStream对象
        4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
        5.创建一个反序列化ObjectInputStream对象
        6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        7.把Object类型的集合转换为ArrayList类型
        8.遍历ArrayList集合
        9.释放资源
 */
public class SerialList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("魏二狗",23));
        list.add(new Person("董大狗",24));
        list.add(new Person("张三",28));
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\File\\person.txt"));
        oos.writeObject(list);
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\File\\person.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list1=(ArrayList<Person>) o;
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        ois.close();
    }
}
