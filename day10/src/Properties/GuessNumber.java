package Properties;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public GuessNumber() {
    }

    public static void start(){
        int num=new Random().nextInt(100)+1;
        while (true){
            System.out.println("��������µ�����:");
            int guess= new Scanner(System.in).nextInt();
            if (guess>num){
                System.out.println("��µ�����̫����!");
            }else if (guess<num){
                System.out.println("��µ�����̫С��!");
            }else {
                System.out.println("��ϲ���������!");
                break;
            }
        }
    }
}
