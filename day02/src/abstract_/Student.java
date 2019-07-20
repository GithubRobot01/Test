package abstract_;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(super.getAge()+"的"+super.getName()+"学习Java");
    }
}
