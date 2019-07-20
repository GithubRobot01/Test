package SetInterface;

import java.util.HashSet;

//要求:同名同年龄的人,视为同一个人,只能存储一次
public class HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();
        Person p1=new Person("文杰",18);
        Person p2=new Person("文洁",20);
        Person p3=new Person("文杰",18);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);//重写了hashCode与equals方法
    }
}
