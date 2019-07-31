package Generic;

public class GenericMethod {
    public static <T> void method(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        method("sss");
        method(124);
    }
}
