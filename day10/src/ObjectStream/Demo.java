package ObjectStream;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day10\\object.txt"));
        Student s1=new Student("林青霞",30);
        Student s2=new Student("风清扬",33);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day10\\object.txt"));
        //通过抛出异常表示到达流末尾
        while (true){
            Object obj=null;
            try {
                obj= ois.readObject();
            }catch (EOFException e){
                //抓住异常说明读取完成,结束循环
                break;
            }
            Student ss=(Student)obj;
            System.out.println(ss);
        }

        ois.close();
    }
}
