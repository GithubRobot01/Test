package homework;

public class Student /*implements Comparable<Student>*/{
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    /*@Override
    public int compareTo(Student s) {
        int num=this.score-s.score;
        int num1=num==0?(this.age-s.age):num;
        int num2=num1==0?this.name.compareTo(s.name):num1;
        return num2;*/
}
