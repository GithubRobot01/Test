package Homework;

public class Demo12 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        int max = getMax(arr);
        System.out.println("最大值为：" + max);
    }

    public static int getMax(int[] arr){
        if(arr.length == 0){
            throw new ArrayLengthNotZeroException("数组长度不能为0");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}