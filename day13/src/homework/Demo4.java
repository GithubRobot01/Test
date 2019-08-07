package homework;

import java.lang.reflect.Field;

/*
请编写一个方法setProperty，该方法可以接收三个参数，
第一个为Object类型的obj对象，第二个为String类型的propertyName，
第三个为Object类型的value，方法的作用是能够为obj对象中名为propertyName的属性的值设置为value。
在主方法中调用方法进行测试。
 */
public class Demo4 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MyObject my=new MyObject();
        //把my对象中的name属性值设置为张三
        setProperty(my,"name","张三");
    }
    public static void setProperty(Object obj,String propertyName,Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> c = obj.getClass();
        Field field = c.getDeclaredField(propertyName);
        field.setAccessible(true);
        field.set(obj,value);
        //System.out.println(obj);
    }
}
