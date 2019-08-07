package homework;

import java.util.Arrays;

class Student1 {
    private String name;
    private Integer age;

    public Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // 比较两个学生对象年龄的方法
    public static int compareByAge(Student1 s1, Student1 s2) {
        return s1.age.compareTo(s2.age);
    }
}
//假设我们现在有一个Student对象数组，要按照学生的年龄从小到大排序：
public class Demo3 {
    public static void main(String[] args) {
        Student1[] students = {
                new Student1("Tom", 20),
                new Student1("Jerry", 18),
                new Student1("Lily", 19),
                new Student1("Lucy", 22),
                new Student1("kevin", 21)};
        // 第一步，使用Lambda表达式改写
        Arrays.sort(students,(s1,s2)->s1.getAge().compareTo(s2.getAge()));
        // 第二步，使用方法引用改写
        Arrays.sort(students,Student1::compareByAge);
        // 遍历
        for (Student1 student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }
}