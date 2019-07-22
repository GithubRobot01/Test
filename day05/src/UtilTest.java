public class UtilTest {
    public static void main(String[] args) {
        double add = BigDecimalUtil.add(19.99, 20);
        System.out.println(add);
        double diff=BigDecimalUtil.subtract(1,0.66);
        System.out.println(diff);
        double pro=BigDecimalUtil.multiply(0.033,100);
        System.out.println(pro);
        double quo=BigDecimalUtil.divide(1,3,5);
        System.out.println(quo);
    }
}
