package PropertiesReflect;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties pro=new Properties();
        FileReader fr=new FileReader("day13\\class.txt");
        pro.load(fr);
        fr.close();
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();

        Method method = c.getMethod(methodName);
        method.invoke(o);
    }
}
class Student{
    public Student(){

    }
    public void study(){
        System.out.println("好好学习,天天向上!");
    }
}
class Teacher{
    public Teacher(){

    }
    public void teach(){
        System.out.println("有教无类!");
    }
}