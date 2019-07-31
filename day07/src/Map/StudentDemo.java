package Map;

import java.util.HashMap;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) {
        HashMap<Student,String> map=new HashMap<>();
        Student stu1=new Student("张三",22);
        Student stu2=new Student("张三",22);
        Student stu3=new Student("李四",22);
        map.put(stu1,"郑州");
        map.put(stu2,"杭州");
        map.put(stu3,"苏州");
        Set<Student> students = map.keySet();
        for (Student s : students) {
            System.out.println(s+"-->"+map.get(s));
        }
    }
}
