package Other;

import java.util.Random;
import java.util.Scanner;

public class EqualsTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username="itheima";
        String password="czbk";
        String yanzheng=getCode();
        for (int i = 2; i >=0 ; i--) {
            boolean mark=true;
            System.out.println("请输入账号:");
            String name=sc.next();
            System.out.println("请输入密码:");
            String pas=sc.next();
            System.out.println("验证码为:"+yanzheng+" 请输入验证码:");
            String yzm=sc.next();
            if (name.equals(username)&&pas.equals(password)){
                while (mark){
                    if (yzm.equalsIgnoreCase(yanzheng)){
                        System.out.println("登陆成功!");
                        mark=false;
                    }else{
                        yanzheng=getCode();
                        System.out.println("验证码输入错误!");
                        System.out.println("验证码为:"+yanzheng+"请输入验证码:");
                        yzm=sc.next();
                    }
                }
                break;
            }else{
                if(i==0){
                    System.out.println("多次输入错误,账号已被锁定!");
                }else {
                    System.out.println("账号或密码输入错误!您还有" + i + "次机会");
                }
            }
        }
    }
    //该方法用于获取随机的验证码
    public static String getCode(){
        String all="";
        for (char ch = 'A'; ch <='Z' ; ch++) {
            all+=ch;
        }
        for (char ch = 'a'; ch <='z' ; ch++) {
            all+=ch;
        }
        for (char ch = '0'; ch <='9' ; ch++) {
            all+=ch;
        }
        String code="";
        for (int i = 0; i < 4; i++) {
            int index=new Random().nextInt(62);
            code+=all.charAt(index);
        }
        return code;
    }
}
