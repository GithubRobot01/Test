package abstract_;

public class Demo {
    public static void main(String[] args) {
        Person p=new Student("万强胜",23);
        p.study();

        Person p1=new Student();
        p1.setName("武文杰");
        p1.setAge(24);
        p1.study();
    }
}
