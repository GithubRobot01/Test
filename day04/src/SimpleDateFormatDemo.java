import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(d);
        System.out.println(format);

        String s="2020.09.08 8-19";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy.MM.dd HH-mm");
        Date parse = sdf1.parse(s);
        System.out.println(parse);
    }
}
