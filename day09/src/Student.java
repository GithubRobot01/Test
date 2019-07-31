public class Student {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public int getChinese() {
        return chinese;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return  name + ',' + chinese + "," + math + "," + english;
    }

    public int sum(){
        return chinese+math+english;
    }
}
