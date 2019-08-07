package Apply;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@MyAnno(className = "Apply.Test01",methodName = "show")
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.解析注解
        //1.1 获取该类的字节码文件对象
        Class<Demo> demoClass = Demo.class;
        //2.获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
           /*

            public class ProImpl implements Pro{
                public String className(){
                    return "cn.itcast.annotation.Demo1";
                }
                public String methodName(){
                    return "show";
                }

            }
            */

        MyAnno anno = demoClass.getAnnotation(MyAnno.class);
        //3.调用注解对象中定义的丑行方法,获取返回值
        String className=anno.className();
        String methodName=anno.methodName();

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getDeclaredConstructor();
        con.setAccessible(true);
        Object o = con.newInstance();
        Method method = c.getMethod(methodName);
        method.invoke(o);
    }
}
