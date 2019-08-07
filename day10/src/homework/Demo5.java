package homework;

import java.io.*;

/*
请编写程序将若干学生对象保存到当前模块的下的object.txt文件中，
保存成功后，还可以读取文件获取到这些学生对象。
提示：从文件中读取对象时，与读取其他数据不同，
readObject方法是通过抛出异常（EOFException）来表示到达文件末尾的，
所以循环读取多个对象时，可以通过捕获该异常来结束读取。
除了这种方式还可以怎样比较方便的将多个学生对象只读写一次，以避免此问题？
 */
public class Demo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day10\\object.txt"));
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day10\\object.txt"));
        Student s1=new Student("张三",22);
        Student s2=new Student("李四",23);
        Student s3=new Student("王五",25);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.close();
        while (true){
            try {
                Object s = ois.readObject();
                Student stu=(Student) s;
                System.out.println(stu.getName()+","+stu.getAge());
            }catch (EOFException e){
                break;
            }
        }
    }
}
