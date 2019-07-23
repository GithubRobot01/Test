package Supplier;

import java.util.function.Supplier;

/*
求数组元素最大值
使用Supplier接口作为方法参数类型,通过Lambda表达式求数组中的最大值
 */
public class SupplierArr {
    //定义一个方法,用于获取int数组元素的最大值
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr={3,1,5,7,2,10,6};
        int maxValue=getMax(()->{
            int max=arr[0];
            for (int i:arr){
                if(i>max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
