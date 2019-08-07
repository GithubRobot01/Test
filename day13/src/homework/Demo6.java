package homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;

public class Demo6 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", "heima001");
        map.put("name", "张三");
        map.put("age", 23);
        map.put("birthday", "1999-09-09");
        /*Class<Student> c = Student.class;
        Constructor<Student> con = c.getConstructor();
        Student stu = con.newInstance();
        Set<String> set = map.keySet();
        for (String s : set) {
            Field field = c.getDeclaredField(s);
            field.setAccessible(true);
            field.set(stu,map.get(s));
        }*/
        Class<?> clazz = Class.forName("homework.Student");
        Constructor<?> con = clazz.getDeclaredConstructor();
        //通过反射获取构造方法并实例化对象
        Student stu = (Student)con.newInstance();
        Method[] methods = clazz.getMethods();
        Set<String> set = map.keySet();
        for (String key:set){
            Object value = map.get(key);
            //根据key拼接相应的get属性方法
            String methodName="set".concat(key.substring(0,1).toUpperCase()).concat(key.substring(1));
            //遍历方法集合,查看是否存在此get方法
            for (Method m : methods) {
                if (m.getName().equals(methodName)){
                    m.invoke(stu,value);
                }
            }
        }
        System.out.println(stu);
    }
}

class Student {
    private String id;
    private String name;
    private Integer age;
    private String birthday;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}