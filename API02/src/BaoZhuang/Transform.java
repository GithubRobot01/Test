package BaoZhuang;
/*
基本类型与字符串类型之间的相互转换
基本类型->字符串
1.基本类型的值+""  最简单的方法(工作中常用)
2.包装类的静态方法toString(参数),不是Object类中的toString()  重载的关系
    static String toString(int i) 返回一个表示指定整数的String对象
3.String类的静态方法valueOf(参数)
    static String valueOf(int i) 返回int参数的字符串表示形式
字符串->基本类型
    使用包装类的静态方法parseXXX("字符串");
    Integer类:static int parseInt(String s)
    Double类:static double parseDouble(String s)
 */
public class Transform {
    public static void main(String[] args) {
        int i=100;
        String s1=i+"";
        System.out.println("s1:"+s1+200);
        String s2=Integer.toString(100);
        System.out.println("s2:"+s2+200);
        String s3=String.valueOf(100);
        System.out.println("s3:"+s3+200);
        System.out.println("===============");
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
    }
}
