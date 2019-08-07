package homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("homework.Student");
        Constructor<?> con = c.getConstructor();
        Student01 s= (Student01)con.newInstance();
        s.setName("张三");
        s.setAge(22);
        Method method = c.getMethod("showInfo");
        method.invoke(s);
    }
}
