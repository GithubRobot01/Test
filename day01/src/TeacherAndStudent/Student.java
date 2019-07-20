package TeacherAndStudent;

public class Student extends Person{
    private String sex;
    public Student() {
    }

    public Student(String name, int age,String sex) {
        super(name, age);
        this.sex=sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void study(){
        if (getSex()=="女"){
            System.out.println(getAge()+"岁的"+getName()+"美女,好好学习,天天向上!");
        }else if (getSex()=="男"){
            System.out.println(getAge()+"岁的"+getName()+"帅哥,好好学习,天天向上!");
        }else{
            System.out.println(getAge()+"岁的"+getName()+"人妖,好好学习,天天向上!");
        }
    }
}
