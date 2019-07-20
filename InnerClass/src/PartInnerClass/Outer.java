package PartInnerClass;
/*
定义一个类的时候,权限修饰符规则:
1.外部类:public/(default)
2.成员内部类:public/protected/(default)/private
3.局部内部类:什么都不能写

局部内部类:如果希望访问所在方法的局部变量,那么这个局部变量必须是[有效final的]
原因:
1.new出来的对象存在于堆内存
2.局部变量是跟着方法走的,在栈内存当中
3.方法运行结束之后,立刻出栈,局部变量就会立刻消失
4.但是new出来的对象会在堆中持续存在,直到垃圾回收消失
*/
public class Outer {
    public void methodOuter(){
        class Inner{ //局部内部类
            int num=10;
            //num=20; 错误写法
            public void methodInner(){
                System.out.println(num);
            }
        }

        Inner inner=new Inner();
        inner.methodInner();
    }
}
