package Other;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        String s=new Scanner(System.in).nextLine();
        String[] str1=s.split("\"");  //将输入的字符串以"切割
        String ip=str1[1];  //取出ip地址
        System.out.println(ip);
        String[] str2 = ip.split("\\.");  //将ip以.切割
        String str=""; //用来存储无效ip
        for (int i = 0; i < str2.length; i++) {
            if (i==str2.length-1){
                str+=str2[i];
            }else{
                str+=str2[i]+"[.]";
            }
        }
        System.out.println(str);

    }
}
