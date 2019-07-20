package Object;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    //重写Object类中的tostring()方法
    @Override
    public String toString() {
        return "姓名:" + name + ",年龄:" + age;
    }
    //重写Object类中的equals()方法

    @Override
    public boolean equals(Object obj) {
        //增加一个判断,防止类型转换出现ClaCastException
        if (obj instanceof Student){
            //向下转型
            Student stu=(Student) obj;
            boolean b = this.name.equals(stu.name) && this.age == stu.age;
            return b;
        }
            //不是Student类型,直接返回false
            return false;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
