package homework;

import java.io.*;

/*
���д��������ѧ�����󱣴浽��ǰģ����µ�object.txt�ļ��У�
����ɹ��󣬻����Զ�ȡ�ļ���ȡ����Щѧ������
��ʾ�����ļ��ж�ȡ����ʱ�����ȡ�������ݲ�ͬ��
readObject������ͨ���׳��쳣��EOFException������ʾ�����ļ�ĩβ�ģ�
����ѭ����ȡ�������ʱ������ͨ��������쳣��������ȡ��
�������ַ�ʽ�����������ȽϷ���Ľ����ѧ������ֻ��дһ�Σ��Ա�������⣿
 */
public class Demo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day10\\object.txt"));
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day10\\object.txt"));
        Student s1=new Student("����",22);
        Student s2=new Student("����",23);
        Student s3=new Student("����",25);
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
