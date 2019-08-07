package getclassobject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflect_Constructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("getclassobject.Student");
        //Constructor<?>[] getConstructors​() 返回一个包含 Constructor对象的数组
        // Constructor对象反映了由该 Class对象表示的类的所有公共构造函数
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        //public Student(String name, int age, String sex)
        //Constructor<T> getConstructor​(Class<?>... parameterTypes)
        // 返回一个 Constructor对象，该对象反映由该 Class对象表示的类的指定公共构造函数
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        Object o = con.newInstance("张三", 22, "男");
        System.out.println(o);
        System.out.println("---------------");
        //private Student(String sex)
        //Constructor<T> getDeclaredConstructor​(Class<?>... parameterTypes)
        // 返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数
        Constructor<?> dc = c.getDeclaredConstructor(String.class);
        //暴力反射
        //public void setAccessible​(boolean flag):值为true，取消访问检查
        dc.setAccessible(true);
        Object s = dc.newInstance("男");
        System.out.println(s);
    }
}
