package homework;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        TreeSet<Student> set=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1=o1.getScore()-o2.getScore();
                int num2=num1==0?o1.getAge()-o2.getAge():num1;
                int num3=num2==0?o1.getName().compareTo(o2.getName()):num2;
                return num3;
            }
        });
        Student stu1=new Student("Tom",20,90);
        Student stu2=new Student("Jerry",22,95);
        Student stu3=new Student("John",20,100);
        Student stu4=new Student("Lily",22,100);
        Student stu5=new Student("Lucy",22,90);
        Student stu6=new Student("Kevin",22,90);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);
        set.add(stu6);
        for (Student s : set) {
            System.out.println("姓名:"+s.getName()+",年龄:"+s.getAge()+",成绩:"+s.getScore());
        }
    }
}
