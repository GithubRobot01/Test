package homework_06;

public class WorkTeacher extends Teacher{
    @Override
    public void teach(){
        System.out.println("就业班老师讲JavaEE");
    }

    public WorkTeacher(String name, int age) {
        super(name, age);
    }
}
