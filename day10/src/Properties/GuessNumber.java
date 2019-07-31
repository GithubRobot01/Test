package Properties;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public GuessNumber() {
    }

    public static void start(){
        int num=new Random().nextInt(100)+1;
        while (true){
            System.out.println("请输入你猜的数字:");
            int guess= new Scanner(System.in).nextInt();
            if (guess>num){
                System.out.println("你猜的数字太大了!");
            }else if (guess<num){
                System.out.println("你猜的数字太小了!");
            }else {
                System.out.println("恭喜你猜中数字!");
                break;
            }
        }
    }
}
