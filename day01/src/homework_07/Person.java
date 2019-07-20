package homework_07;

public class Person {
    private String name;
    private String ID;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person(String name, String ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Work");
    }
}
