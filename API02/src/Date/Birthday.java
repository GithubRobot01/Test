package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您的出生日期,格式yyyy-MM-dd");
        String birth=new Scanner(System.in).next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sdf.parse(birth);
        long time=birthDate.getTime();
        long todayTime=new Date().getTime();
        System.out.println((todayTime-time)/24/60/60/1000);
    }
}
