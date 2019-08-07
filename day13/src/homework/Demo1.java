package homework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list=new ArrayList<>();
        Class<? extends ArrayList> c = list.getClass();
        Method method = c.getMethod("add", Object.class);
        method.invoke(list,"hello");
        System.out.println(list);
    }
}
