package homework_07;

public class Manager extends Person {
    private double bonus;

    public Manager(String name, String ID, double salary,double bonus) {
        super(name, ID, salary);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work(){
        System.out.println("姓名为:"+super.getName()+",工号为:"+super.getID()+",工资为:"+super.getSalary()+",奖金为:"+bonus+",的项目经理正在管理程序员写代码");
    }
}
