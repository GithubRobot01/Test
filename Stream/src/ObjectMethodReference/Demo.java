package ObjectMethodReference;
/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的,成员方法也是已经存在
    就可以使用对象名来引用成员方法
 */
public class Demo {

    public static void printString(Printable p){
        p.print("Hello");
    }
    //调用printString方法,方法的参数Printable是一个函数式接口,所以可以传递Lambda表达式
    public static void main(String[] args) {
        printString(str->{
            //创建MethodRefObj对象
            MethodRefObj obj=new MethodRefObj();
            obj.printUpper(str);
        });
        /*
            使用方法引用优化Lambda
            对象是已经存在的MethodRerObject
            成员方法也是已经存在的printUpperCaseString
            所以我们可以使用对象名引用成员方法
         */
        //创建MethodRerObject对象
        MethodRefObj obj=new MethodRefObj();
        printString(obj::printUpper);
    }
}
