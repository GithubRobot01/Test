package getclassobject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
         //Method[] getMethods​() 返回一个包含方法对象的数组，
         方法对象反映由该 Class对象表示的类或接口的所有公共方法，
         包括由类或接口声明的对象以及从超类和超级接口继承的类
        //Method[] getDeclaredMethods​() 返回一个包含方法对象的数组,
        方法对象反映由 Class对象表示的类或接口的所有声明方法，
        包括public，protected，default（package）访问和私有方法，但不包括继承方法
         */
        /*
        //Method getMethod​(String name, Class<?>... parameterTypes)
        返回一个方法对象，该对象反映由该Class对象表示的类或接口的指定公共成员方法
        //Method getDeclaredMethod​(String name, Class<?>... parameterTypes)
        返回一个方法对象,它反映此表示的类或接口的指定声明的方法Class对象
         */
public class Reflect_Method {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取class对象
        Class<Student> c = Student.class;
        //获取无参构造方法
        Constructor<?> dc = c.getDeclaredConstructor();
        //实例化对象
        Object obj = dc.newInstance();
        //获取方法(参数为要获取的方法名)
        Method method = c.getDeclaredMethod("publicMethod");
        //调用obj对象的publicMethod方法
        method.invoke(obj);
        System.out.println("----------");
        //获取方法,该方法需要一个String类型的参数
        Method method1 = c.getDeclaredMethod("method", String.class);
        method1.setAccessible(true);
        //调用obj对象的method方法,并传入字符串"reverse"
        Object reverse = method1.invoke(obj, "reverse");
        System.out.println(reverse);
    }
}
