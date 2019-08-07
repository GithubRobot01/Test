package Fun;

public class MyStringTest {
    public static void main(String[] args) {
        useMyString((s,x,y)->s.substring(2,5));
        useMyString(String::substring);
    }
    public static void useMyString(MyString my){
        String s=my.mySubstring("helloworld",2,5);
        System.out.println(s);
    }
}
