package Calendar;
import java.util.Calendar;
import java.util.Date;

/*
Calendar类是一个抽象类,里面提供了很多操作日历字段的方法
Calendar类无法直接创建对象,里面有一个静态方法getInstance(),
该方法返回了Calendar类的子对象
static Calendar getInstance()使用默认的时区和语言环境获得一个日历
 */
public class DemoCalendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance(); //多态
        int year = c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day=c.get(Calendar.DATE);
        //西方月为0-11
        System.out.println(year+"年"+(month+1)+"月"+day+"日");
        System.out.println("==============");
        c.set(Calendar.YEAR,2020);
        c.set(Calendar.MONTH,01);
        c.set(Calendar.DATE,01);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH))+"月"+c.get(Calendar.DATE)+"日");
        System.out.println("===============");
        c.set(2019,9,9);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH))+"月"+c.get(Calendar.DATE)+"日");
        System.out.println("===============");
        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,2);
        c.add(Calendar.DATE,-2);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH))+"月"+c.get(Calendar.DATE)+"日");
        System.out.println("===============");
        Date date=c.getTime();
        System.out.println(date);
    }
}
