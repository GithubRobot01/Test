package Exception_;
//异常产生过程解析(分析异常是怎么产生的,如何处理异常)
public class ExceptionDemo02 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int e=getElement(arr,3);
    }

    private static int getElement(int[] arr, int i) {
        return arr[i];
    /*范围数组中的索引3,JVM会检测出程序出现异常
    JVM会做两件事情:
        1.JVM会根据异常产生的原因创建一个异常对象,这个异常对象包含了异常产生的(内容,原因,位置)
        2.在getElement方法中,没有异常的处理逻辑(try...catch),那么JVM就会把异常对象抛出给方法调用者main方法来处理这个异常

        main方法接收到这个异常对象,main方法也没有异常的处理逻辑,继续把异常对象抛出给main方法的调用者JVM处理

        JVM接收到这个异常对象,做了两件事情
        1.把异常对象(内容,原因,位置)以红色字体打印在控制台
        2.JVM会终止当前正在执行的java程序-->中断处理
    */
    }
}
