package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student s1=new Student("陈二狗",28);
        Student s2=new Student("曹蒹葭",27);
        Student s3=new Student("富贵",30);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ListIterator<Student> it = list.listIterator();
        while (it.hasNext()){
            Student s=it.next();
            if (s.equals(s3)){
                it.add(s1);
            }
            System.out.println(s);
        }
    }
}
