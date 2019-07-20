package Lambda;

public class CalcDemo {
    public static void main(String[] args) {
        //调用invokeCalc方法,方法参数是一个接口,可以使用匿名内部类
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        //使用lambda表达式
        invokeCalc(10,20,(int a, int b)->{
            return a+b;
        });
        //优化
        invokeCalc(10,20,(a,b)->a+b);
    }
    public static void invokeCalc(int a,int b,Calculator c){
        int sum=c.calc(a,b);
        System.out.println(sum);
    }
}
