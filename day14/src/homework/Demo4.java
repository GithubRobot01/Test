package homework;

public class Demo4 {
    public static void main(String[] args) {
        String str = "this is a function reference test";
        // 调用方法，获取反转的结果
        /*
        String revStr = StringOperate(new StringInter(){
            @Override
            public String func(String str) {
                return new StringBuilder(str).reverse().toString();
            }
        }, str);
        */
        // 请使用方法引用改写
        String revStr=StringOperate(MyStringOps::strReverse,str);

        System.out.println("str: " + str);
        System.out.println("revStr: " + revStr);

    }
    // 在主方法中调用该方法，得到反转的字符串
    public static String StringOperate(StringInter si, String str) {
        return si.func(str);
    }
}
// 函数式接口
interface StringInter {
    String func(String str);
}

// 一个字符串操作类
class MyStringOps {
    // 反转字符串的静态方法
    public static String strReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}