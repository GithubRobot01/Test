package homework;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            int min=s.charAt(s.length()-1);
            int index=s.length()-1;
            for(int j=s.length()-1;j>=0;j--){
                int n=s.charAt(j);
                if (min>n){
                    min=n;
                    index=j;
                }
            }
            if (index==s.length()-1){
                s=s.substring(0,s.length()-1);
            }else{
                s=s.substring(0,index).concat(s.substring(index+1));
            }
        }
        System.out.println(s);
    }
}
