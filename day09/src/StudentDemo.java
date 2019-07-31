import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> set=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num1=s2.sum()-s1.sum();
                int num2=num1==0?s2.getChinese()-s1.getChinese():num1;
                int num3=num2==0?s2.getMath()-s1.getMath():num2;
                int num4=num3==0?s2.getName().compareTo(s1.getName()):num3;
                return num4;
            }
        });
        for (int i = 0; i < 5; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"位同学的成绩:");
            System.out.println("姓名:");
            String name = sc.nextLine();
            System.out.println("语文成绩:");
            int chinese = sc.nextInt();
            System.out.println("数学成绩:");
            int math = sc.nextInt();
            System.out.println("英语成绩:");
            int english = sc.nextInt();
            Student s=new Student(name,chinese,math,english);
            set.add(s);
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("day09\\student.txt"));
        for (Student s : set) {
            bw.write(s.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
