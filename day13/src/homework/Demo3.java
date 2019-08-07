package homework;

import java.lang.reflect.Field;

/*
请编写一个方法getProperty，该方法接收两个参数，
第一个为Object类型的obj对象，第二个为String类型的propertyName，
返回值为Object类型，其作用是可以获取obj对象中名为propertyName的属性的值。
在主方法中调用方法进行测试。
 */
public class Demo3 {
    /*public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("homework.MyObject");
        //获取构造方法
        Constructor<?> dc= c.getDeclaredConstructor();
        dc.setAccessible(true);
        //通过构造方法创建对象
        Object o = dc.newInstance();
        Object obj = getProperty(o, "张三");
        System.out.println(obj);
    }
    public static Object getProperty(Object obj,String propertyName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> c = obj.getClass();
        Method setter = c.getDeclaredMethod("setPropertyName",String.class);
        setter.setAccessible(true);
        setter.invoke(obj, propertyName);
        Method getter = c.getDeclaredMethod("getPropertyName");
        getter.setAccessible(true);
        Object name = getter.invoke(obj);
        return name;
    }*/
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MyObject my=new MyObject("张三",22);
        Object o = getProperty(my, "name");
        System.out.println(o);
    }
    public static Object getProperty(Object obj,String propertyName) throws NoSuchFieldException, IllegalAccessException {
        Class<?> c = obj.getClass();
        Field field = c.getDeclaredField(propertyName);
        field.setAccessible(true);
        Object nm = field.get(obj);
        return nm;
    }
}
