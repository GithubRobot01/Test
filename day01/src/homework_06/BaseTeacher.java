package homework_06;

public class BaseTeacher extends Teacher {
    @Override
    public void teach(){
        System.out.println("基础班老师讲JavaSE");
    }

    public BaseTeacher(String name, int age) {
        super(name, age);
    }
}
