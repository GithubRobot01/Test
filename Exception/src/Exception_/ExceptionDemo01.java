package Exception_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
异常本身是一个类,产生异常就是创建异常对象并抛出了一个异常对象。Java处理异常的方式是中断处理。
java.lang.Throwable类是Java语言中所有错误或异常的超类
    Exception:编译期异常,进行编译(写代码)java程序出现的问题
        RuntimeException;运行期异常,java运行过程中出现的问题
        异常相当于程序得了一个小毛病,把异常处理掉,程序可以继续执行
    Error:错误
        错误就相当于程序得了无法治愈的疾病,必须修改源代码,程序才能继续执行
*/
public class ExceptionDemo01 {
    public static void main(String[] args) {
        //编译期异常,进行编译(写代码)java程序出现的问题
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date=sdf.parse("2019-079"); //格式错误会出现异常
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("后续代码");
        //运行期异常,java运行过程中出现的问题
        int[] arr={1,2,3};
        try {
            //可能出现异常的代码
            System.out.println(arr[3]);
        }catch (Exception e){
            //异常的处理逻辑
            System.out.println(e);
        }
        System.out.println("后续代码");
        //Error:错误  OutOfMemoryError内存溢出错误,创建的数组太大了,超出了给JVM分配的内存
        int[] arr1=new int[1024*1024*1024];
        //必须修改代码才能解决
    }
}
