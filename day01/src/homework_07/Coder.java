package homework_07;

public class Coder extends Person{
    public Coder(String name, String ID, double salary) {
        super(name, ID, salary);
    }

    @Override
    public void work(){
        System.out.println("姓名为:"+super.getName()+",工号为:"+super.getID()+",工资为:"+super.getSalary()+",的程序员正在编写代码");
    }
}
