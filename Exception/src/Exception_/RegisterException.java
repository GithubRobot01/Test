package Exception_;
/*
自定义异常类:java提供的异常类,不够我们使用,需要自己定义一些异常类
格式:public class xxxException extends Exception/RuntimeException{
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
            }
1. 自定义一个编译期异常类:自定义类并继承于Exception,如果方法内部抛出编译期异常,就必须处理这个异常,要么throws要么try...catch
2. 自定义一个运行期异常类:自定义类并继承于RuntimeException,无需处理,交给虚拟机处理
 */
public class RegisterException extends Exception{
    public RegisterException(){

    }
    public RegisterException(String message){
        super(message);
    }
}
