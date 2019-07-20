package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            System.out.println("请录入第"+i+"个评委成绩:");
            list.add(new Scanner(System.in).nextInt());
        }
        int max=0;
        int min=100;
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            int score=list.get(i);
            sum+=score;
            if(score>max){
                max=score;
            }
            if(score<min){
                min=score;
            }
        }
        System.out.println((sum-min-max)*1.0/(list.size()-2));
    }
}