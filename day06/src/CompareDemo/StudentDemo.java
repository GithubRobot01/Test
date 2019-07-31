package CompareDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        TreeSet<Student> set=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num=s2.getScore()-s1.getScore();
                int num2=num==0?s1.getAge()-s2.getAge():num;
                int num3=num2==0?s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });
        set.add(new Student("张三",20,100));
        set.add(new Student("张三",20,100));
        set.add(new Student("张三",22,90));
        set.add(new Student("李四",20,100));
        set.add(new Student("李四",21,101));
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
