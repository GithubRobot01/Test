package MapJiHe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
of()方法只是Map，List，Set这三个接口的静态方法，其父类接口和子类实现并没有这类方法，
of方法返回的集合是不可变的,集合不能再使用add,put方法添加元素,会抛出异常
Set接口和Map接口在调用of方法的时候,不能有重复的元素,否则会抛出异常
*/
public class JDK9Demo {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e");
//      list.add("f"); //UnsupportedOperationException 不支持参数异常
        System.out.println(list);
        Set<String> set = Set.of("a", "b", "c", "d", "e"); //不允许重复元素,IllegalArgumentException,非法参数异常
        System.out.println(set);
        Map<String,Integer> map=Map.of("张三",18,"李四",19);
        System.out.println(map);
    }
}
