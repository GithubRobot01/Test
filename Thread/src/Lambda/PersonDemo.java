package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDemo {
    public static void main(String[] args) {
        Person[] arr={
                new Person("魏泽源",24),
                new Person("万强胜",23),
                new Person("武文杰",25)
        };
        //对数组中的Person对象使用Arrays中的sort方法通过年龄进行升序
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        //使用lambda表达式
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge()-o2.getAge();
        });
        //遍历数组
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
