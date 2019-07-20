package homework_01;

public class Student extends Person {
    private String school; // 所在学校

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getInfo() {
        return "Student[name=" + super.getName() + ", age=" + super.getAge() + ", birthday=" + super.getBirthday() + ", school=" + school + "]";
    }
}
