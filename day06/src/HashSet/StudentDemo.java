package HashSet;

import java.util.HashSet;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) {
        Student stu1=new Student("张三",23);
        Student stu2=new Student("李四",23);
        Student stu3=new Student("张三",25);
        Student stu4=new Student("张三",23);
        Set<Student> set=new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        for (Student student : set) {
            System.out.println(student.getName()+student.getAge());
        }
    }
}
