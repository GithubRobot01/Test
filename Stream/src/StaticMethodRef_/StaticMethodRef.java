package StaticMethodRef_;

public class StaticMethodRef {
    public static int method(int num,Calc c){
        return c.absMethod(num);
    }

    public static void main(String[] args) {
        int abs=method(-3,num->Math.abs(num));
        System.out.println(abs);
         /*
            使用方法引用优化Lambda表达式
            Math类是存在的
            abs计算绝对值的静态方法也是已经存在的
            所以我们可以直接通过类名引用静态方法
         */
        int a=method(-5,Math::abs);
        System.out.println(a);
    }
}
