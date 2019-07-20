package Exception_;

import java.util.Scanner;

public class RegisterExceptionDemo {
    static String[] userName={"张三","李四","王五","赵六"};
    public static void main(String[] args){
        System.out.println("请输入您要注册的用户名:");
        String name=new Scanner(System.in).next();
        checkUserName(name);
    }
    public static void checkUserName(String name){
        for (String s : userName) {
            if (s.equals(name)){
                //用户名已存在,抛出异常
                try {
                    throw new RegisterException("该用户名已被注册!");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;  //结束方法
                }
            }
        }
        System.out.println("此用户名可以使用.");
    }
}
