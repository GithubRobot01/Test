package homework;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(fn(20));
    }
    public static int fn(int n){
        if (n==1||n==2){
            return 1;
        }else {
            return fn(n-1)+fn(n-2);
        }
    }
}
