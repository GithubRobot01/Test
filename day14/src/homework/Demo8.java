package homework;

// 函数式接口
interface MyCount<T> {
    int count(T[] vals, T val);
}

// 数组操作类
class MyArrayOps {
    // 计算某个值，在数组中出现的次数
    public static <T> int countMatch(T[] vals, T val) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (val.equals(vals[i])) {
                count++;
            }
        }
        return count;
    }
}
public class Demo8 {
    public static void main(String[] args) {
        // 计算数组中数字4出现的次数
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        int count1=myOps(MyArrayOps::countMatch,vals,4);
        System.out.println(count1);

        // 计算数组中单词"Two"出现的次数
        String[] strs = {"One", "Two", "Three", "Two", "Two", "Four"};
        int count2=myOps(MyArrayOps::countMatch,strs,"Two");
        System.out.println(count2);
    }

    // 在主方法中调用该方法
    public static <T> int myOps(MyCount<T> mc, T[] vals, T val) {
        return mc.count(vals, val);
    }
}