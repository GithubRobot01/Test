package Other;

public class DebugTest {
    public static void main(String[] args) {
        int a=getmax(10,20);
        System.out.println(a);
    }
    public static int getmax(int a,int b){
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        System.out.println("循环结束!");
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
