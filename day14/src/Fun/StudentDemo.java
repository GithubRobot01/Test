package Fun;

public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder(((name, age) -> new Student(name,age)));
        useStudentBuilder(Student::new);
    }
    public static void useStudentBuilder(StudentBuilder sb){
        Student s = sb.build("张三", 22);
        System.out.println(s.getName()+","+s.getAge());

    }
}
