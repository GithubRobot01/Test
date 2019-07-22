import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger sum=new BigInteger(String.valueOf(1));
        for (int i = 1; i <=1000; i++) {
            BigInteger j=new BigInteger(String.valueOf(i));
            sum=sum.multiply(j);
        }
        String s=sum.toString();
        int count=0;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i)!='0'){
                break;
            }
            count++;
        }
        System.out.println("1000的阶乘末尾共有"+count+"个零");
    }
}
