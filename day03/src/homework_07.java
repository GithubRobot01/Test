public class homework_07 {
    public static void main(String[] args) {
        // 创建对象，并初始化数据
        Person p1 = new Person("张三",23);
        Person p2 = new Person("张三",23);
        // 比较两个对象
        System.out.println(p1.equals(p2));
    }
}

class Person{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
       if(this==o)
           return true;
       if (o==null)
           return false;
       if(!(o instanceof Person))
           return false;
       Person p=(Person) o;
        return this.age==p.age&&this.name.equals(p.name);

    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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