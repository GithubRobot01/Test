package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) throws ParseException {
        long time=System.currentTimeMillis();
        System.out.println(time); //输出当前时间距1970年毫秒数
        Date date1=new Date();
        System.out.println(date1); //输出当前时间
        System.out.println(date1.getTime());  //输出为毫秒数
        Date date2=new Date(time); //参数为毫秒数,返回日期
        System.out.println(date2);
        System.out.println("=============");
        //创建对象,构造方法中传递指定的模式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //调用format方法,按照构造方法中的指定模式,把Date日期格式转化为符合文本模式的字符串
        System.out.println(sdf.format(date1));
        demo();
    }

    private static void demo() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //传入字符串的模式要与构造方法传入的模式相同
        Date date = sdf.parse("2019年7月5日 15时08分54秒");
        System.out.println("================");
        System.out.println(date);
    }
}
