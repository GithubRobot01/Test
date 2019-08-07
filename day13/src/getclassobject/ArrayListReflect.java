package getclassobject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListReflect {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(250);
        Class<? extends ArrayList> c = list.getClass();
        Method method = c.getDeclaredMethod("add", Object.class);
        method.invoke(list,"hehe");
        System.out.println(list);
        System.out.println("----------------");


    }
}
