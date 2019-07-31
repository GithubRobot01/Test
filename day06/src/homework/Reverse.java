package homework;

public class Reverse {
    public static void main(String[] args) {
        for (int i = 100; i < 317; i++) {
            int num=i*i;
            StringBuilder s=new StringBuilder(String.valueOf(num));
            String s1=s.toString();
            StringBuilder reverse = s.reverse();
            String reverse1=reverse.toString();
            if(s1.equals(reverse1)){
                System.out.println(num);
            }
        }
    }
}
