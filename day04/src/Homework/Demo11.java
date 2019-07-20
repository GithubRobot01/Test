package Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Person p=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name=sc.next();
        p.setName(name);
        while (true) {
            System.out.println("请输入年龄：");
            try {
                p.setAge(new Scanner(System.in).nextInt());
//                int age=sc.nextInt();
//                p.setAge(age);
                break;
            }catch (InputMismatchException e){
                System.out.println("您输入的年龄格式有误，请重新输入！");
            }
        }
        System.out.println("输入完毕，信息为：");
        System.out.println(p);
    }
}

