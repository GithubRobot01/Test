package homework;

public class Demo7 {
    public static void main(String[] args) {
        // 使用匿名内部类
        /*
        MyInter mi = new MyInter() {
            @Override
            public MyClass func(int value) {
                return new MyClass(value);
            }
        };
        MyClass mc = mi.func(100);
        */
        // 使用Lambda表达式改进
        MyInter mi1=(value)->new MyClass(value);
        // 使用方法引用改进
        MyInter mi2=(MyClass::new);
        // 打印成员变量的值
        MyClass mc=mi2.func(100);
        System.out.println(mc.getValue());
    }
}

// 函数式接口
interface MyInter {
    MyClass func(int value);
}

class MyClass {
    private int value;
    // 构造方法
    public MyClass(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}