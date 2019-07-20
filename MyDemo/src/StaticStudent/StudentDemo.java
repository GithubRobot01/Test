package StaticStudent;

public class StudentDemo {
    public static void main(String[] args) {
        Student stu=new Student();
        Student stu1=new Student("张三",18);
        Student stu2=new Student("李四",19);
        Student stu3=new Student("王五",20);
        Student stu4=new Student("赵六",16);
        stu1.show();
        stu2.show();
        stu3.show();
        stu4.show();
        System.out.println(Student.number);
        Student.staticTest();
    }
}
