package ObjectStream;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day10\\object.txt"));
        Student s1=new Student("����ϼ",30);
        Student s2=new Student("������",33);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day10\\object.txt"));
        //ͨ���׳��쳣��ʾ������ĩβ
        while (true){
            Object obj=null;
            try {
                obj= ois.readObject();
            }catch (EOFException e){
                //ץס�쳣˵����ȡ���,����ѭ��
                break;
            }
            Student ss=(Student)obj;
            System.out.println(ss);
        }

        ois.close();
    }
}
