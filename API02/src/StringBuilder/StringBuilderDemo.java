package StringBuilder;
//字符串缓冲区,可以提高字符串的效率
//构造方法StringBuilder() 构造一个不带任何字符的字符串生成器,其初始容量为16个字符
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("Hello").append("World").append("!");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //StringBuilder与String的相互
        //StringBuilder转换为String,通过toString()方法
        String s=sb.toString();
        System.out.println(s);
        //String转换为StringBuilder,通过构造方法
        StringBuilder ss=new StringBuilder(s);
    }
}
