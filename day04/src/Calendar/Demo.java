package Calendar;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");
        System.out.println("-------------------");
        c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-1);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH)+1;
        int date1 = c.get(Calendar.DATE);
        System.out.println(year1+"年"+month1+"月"+date1+"日");
        System.out.println("-------------------");
        c.set(2008,8,8);
    }
}
