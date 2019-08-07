package getclassobject;

import java.lang.reflect.Field;
//Field getField​(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定公共成员字段
//Field getDeclaredField​(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定声明字段
public class Reflect_Field {
    public static void main(String[] args) throws Exception {
        Student stu=new Student();
        Class<? extends Student> c = stu.getClass();
        //public Field getDeclaredField(String name) 获取由此Class对象表示的类或接口的指定声明字段
        //传入的参数为成员变量的名称
        Field fieldName = c.getDeclaredField("name");
        fieldName.setAccessible(true);
        //设置stu对象的name为张三
        fieldName.set(stu,"张三");
        //获取stu对象的name属性值
        Object o1 = fieldName.get(stu);
        System.out.println(o1);
    }
}
