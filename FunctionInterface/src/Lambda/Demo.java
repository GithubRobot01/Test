package Lambda;
/*
使用Lambda优化日志案例
Lambda的特点:延迟加载
Lambda的使用前提,必须存在函数式接口
 */
public class Demo {
    //定义一个显示日志的方法,方法的参数传递日志等级和Message接口
    public static void showLog(int level,Message m){
        //对日志等级为1,调用Message接口中的message方法
        if(level==1){
            System.out.println(m.message());
        }
    }
    public static void main(String[] args) {
        //定义日志信息
        String s1="error";
        String s2="warning";
        String s3="false";
        showLog(1,()->{ return s1+s2+s3;});
        showLog(2,()->{
            //由于level!=1,所以以下代码不执行
            System.out.println("massage执行");
            return s1+s2+s3;});
    }
    /*
    使用Lambda表达式作为参数传递,仅仅是把参数传递到showLog方法中
    只有满足条件,日志等级为1,才会调用接口Message中的方法message,进行字符串的拼接
    如果不满足条件,日志等级不为1,接口Message中的方法message也不会执行,所以拼接字符串的代码也不会执行
    所以不会存在性能的浪费
     */
}
