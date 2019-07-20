package Other;

import java.util.Random;

public class Question26 {
    private static void nn(){

    }
    public static void main(String[] args) {
        Random r=new Random();
        int[] arr=new int[5];
        for (int i=0;i<5;i++){
            /*定义变量mark用来标记生成的随机数是否是偶数,
            是否与之前的元素重复*/
            boolean mark=true;
            int n=r.nextInt(20)+1;
            for (int j=0;j<=i;j++)
            {
                if(n%2==1||arr[j]==n){
                    mark=false;
                }
            }
            if (mark==true){
                arr[i]=n;
            } else{
                i--;
            }
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1]+" ");
        }
    }
}
