package Exception_;

import java.util.ArrayList;
import java.util.List;

/*
多个异常使用捕获又该如何处理呢？
1. 多个异常分别处理。
2. 多个异常一次捕获，多次处理。
3. 多个异常一次捕获一次处理。
 */
public class Multi_Exception {
    public static void main(String[] args) {
        //1. 多个异常分别处理
        System.out.println("------1------");
        try {
            int[] arr={1,2,3};
            System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            list.add("1");
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        //2. 多个异常一次捕获，多次处理
        //catch定义的异常变量,如果有子父类,那么子类异常变量必须写在上面,否则就会报错
        System.out.println("------2------");
        try {
            int[] arr={1,2,3};
            System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
            ArrayList<String> list = new ArrayList<>();
            list.add("1");
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("------3------");
        //3. 多个异常一次捕获一次处理
        try {
            int[] arr={1,2,3};
            System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
            ArrayList<String> list = new ArrayList<>();
            list.add("1");
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
