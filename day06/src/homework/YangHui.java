package homework;

import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        int[][] arr=new int[num][num];
        for (int i=0;i<num;i++){
            for (int j = 0; j <=i; j++) {
                if (j==0||j==i){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i=0;i<num;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
