package StudentSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        while(true){
            System.out.println("---欢迎使用学生信息管理系统---");
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查看所有学生信息");
            System.out.println("5.退出系统");
            System.out.println("请选择你想要使用的功能:");
            Scanner sc=new Scanner(System.in);
            int m = sc.nextInt();
            switch(m){
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    delStudent(list);
                    break;
                case 3:
                    updateStudent(list);
                    break;
                case 4:
                    findStudent(list);
                    break;
                case 5:
                    System.exit(0);  //JVM退出
                default:
                    System.out.println("输入有误,请重新输入:");
            }
        }
    }
    public static void addStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        String id;
        while(true) {
            System.out.println("请输入学生的学号:");
            id = sc.next();
            boolean mark = isUsed(list, id); //用于标记是否存在该学号的学生
            if (mark) {
                System.out.println("学号为" + id + "的学生信息已存在!");
            } else {
                break;
            }
        }
            System.out.println("请输入学生的姓名:");
            String name = sc.next();
            System.out.println("请输入学生的年龄:");
            String age = sc.next();
            System.out.println("请输入学生的地址:");
            String address = sc.next();
            Student stu = new Student();
            stu.setId(id);
            stu.setName(name);
            stu.setAge(age);
            stu.setAddress(address);
            list.add(stu);
            System.out.println("添加学生成功!");
    }
    public static void delStudent(ArrayList<Student> list){
        int index=-1;  //用来标记是否存在该学生
        System.out.println("请输入需要删除的学生的学号:");
        String id=new Scanner(System.in).next();
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            if(s.getId().equals(id)){
                list.remove(i);
                System.out.println("删除学生信息成功!");
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("不存在学号为"+id+"的学生,无法进行修改!");
        }
    }
    public static void findStudent(ArrayList<Student> list){
        if (list.size()==0){
            System.out.println("无信息,请先添加信息!");
        }else {
            System.out.println("学号\t\t姓名\t\t年龄\t地址\t");
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.println(s.getId() + "\t\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t" + s.getAddress());
            }
        }
    }
    public static void updateStudent(ArrayList<Student> list){
        int index=-1;
        System.out.println("请输入需要修改学生的学号:");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            if(s.getId().equals(id)){
                System.out.println("请输入学生的新姓名:");
                String name=sc.next();
                s.setName(name);
                System.out.println("请输入学生的新年龄:");
                String age=sc.next();
                s.setAge(age);
                System.out.println("请输入学生的新地址:");
                String address=sc.next();
                s.setAddress(address);
                System.out.println("修改学生信息成功!");
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("不存在学号为"+id+"的学生,无法进行修改!");
        }
    }
    public static boolean isUsed(ArrayList<Student> list,String id){
        boolean flag=false;
        for(int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            if(s.getId().equals(id)){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
