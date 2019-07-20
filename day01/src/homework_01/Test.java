package homework_01;

public class Test {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("张三");
        stu.setAge(23);
        stu.setBirthday("1997-04-16");
        stu.setSchool("传智播客");
        String info = stu.getInfo();
        System.out.println(info);
    }
}
