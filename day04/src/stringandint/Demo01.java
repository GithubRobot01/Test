package stringandint;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        String s=new Scanner(System.in).nextLine();
        String[] split = s.split(" ");
        int[] arr=new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i]=Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String result=sb.toString();
        System.out.println(result);
    }
}
