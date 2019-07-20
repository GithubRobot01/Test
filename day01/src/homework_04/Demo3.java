package homework_04;

public class Demo3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);
        Student s1 = new Student("张三",23);
        System.out.println(s1.getName()+"..."+s1.getAge());
    }
}