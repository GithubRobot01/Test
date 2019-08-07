package homework;

import java.util.Arrays;

/*

 */
public class Demo2 {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 6, 1, 9, 3, 0, 7};
        Arrays.sort(arr, (i1,i2)-> i2.compareTo(i1));
        System.out.println(Arrays.toString(arr));
    }
}
