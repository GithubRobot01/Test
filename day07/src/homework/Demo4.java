package homework;

import java.util.HashMap;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        HashMap<Student,String> map=new HashMap<>();
        Student stu1=new Student("小红",20);
        Student stu2=new Student("小黄",22);
        Student stu3=new Student("小白",25);
        Student stu4=new Student("小蓝",23);
        Student stu5=new Student("小绿",21);
        Student stu6=new Student("小绿",21);
        map.put(stu1,"北京海淀");
        map.put(stu2,"北京朝阳");
        map.put(stu3,"北京海淀");
        map.put(stu4,"北京顺义");
        map.put(stu5,"北京海淀");
        map.put(stu6,"北京昌平");
        Set<Student> stu= map.keySet();
        for (Student student : stu) {
            String value=map.get(student);
            System.out.println(student+"---"+value);
        }
    }
}
