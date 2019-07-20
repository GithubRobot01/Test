package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
public static <T> void sort(List<T> list) :将集合中元素按照默认规则排序。
public static <T> void sort(List<T> list，Comparator<? super T> ) :将集合中元素按照指定规则排序。
*/
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        Collections.shuffle(list); //打乱集合
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list); //升序排列集合

        //sort(list<T> list)方法使用前提:被排序的集合里边存储的元素,必须实现Comparable,重写接口中的compareTo方法定义排序的规则
        ArrayList<Person> p=new ArrayList<>();
        p.add(new Person("张三",20));
        p.add(new Person("李四",19));
        p.add(new Person("王五",22));
        Collections.sort(p);
        System.out.println(p);
        System.out.println("============");
        ArrayList<Person> p1=new ArrayList<>();
        p1.add(new Person("张三",20));
        p1.add(new Person("李四",19));
        p1.add(new Person("b王五",22));
        p1.add(new Person("a王五",22));
        Collections.sort(p1, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result= o1.getAge()-o2.getAge();//年龄升序
                if (result==0){
                    //如果年龄相同,比较姓名的第一个字
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(p1);
    }
}
