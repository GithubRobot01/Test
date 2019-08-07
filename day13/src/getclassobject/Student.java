package getclassobject;

public class Student {
    private String name;
    int age;
    public String sex;

    public Student() {
    }

    private Student(String sex) {
        this.sex = sex;
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void publicMethod(){
        System.out.println("publicMethod");
    }

    private String method(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    void defaultMethod(){
        System.out.println("defaultMethod");
    }
}
