package StaticStudent;

public class Student {
    private String name;
    private int age;
    private int id;
    public static int number=0;

    public static void staticTest(){
        System.out.println("这是一个静态方法!");
    }
    public Student() {
        this.id=++number;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++number;
    }
    public void show(){
        System.out.println("姓名:"+name+",年龄:"+age+",ID:"+id);
    }
}
