import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtil {
    private BigDecimalUtil(){
    }
    //求两个double类型的数据的和
    public static double add(double a,double b){
        BigDecimal a1=new BigDecimal(String.valueOf(a));
        BigDecimal b1=new BigDecimal(String.valueOf(b));
        BigDecimal sum=a1.add(b1);
        return sum.doubleValue();
    }
    //计算两个double类型的数据之差,第一个参数为减数,第二个参数为被减数
    public static double subtract(double a,double b){
        BigDecimal a1=new BigDecimal(String.valueOf(a));
        BigDecimal b1=new BigDecimal(String.valueOf(b));
        BigDecimal diff=a1.subtract(b1);
        return diff.doubleValue();
    }
    //计算两个double类型数据的积
    public static double multiply(double a,double b){
        BigDecimal a1=new BigDecimal(String.valueOf(a));
        BigDecimal b1=new BigDecimal(String.valueOf(b));
        BigDecimal pro=a1.multiply(b1);
        return pro.doubleValue();
    }
    /*计算两个两个double类型数据的商
    第一个参数代表被除数,第二个参数代表除数,第三个参数表示保留的小数位数
    该方法的舍入模式为四舍五入*/
    public static double divide(double a,double b,int i){
        BigDecimal a1=new BigDecimal(String.valueOf(a));
        BigDecimal b1=new BigDecimal(String.valueOf(b));
        BigDecimal quo=a1.divide(b1,i, RoundingMode.HALF_UP);
        return quo.doubleValue();
    }
}
