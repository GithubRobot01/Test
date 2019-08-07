package FunInter;

public class InterDemo {
    public static void main(String[] args) {
        useInter((s)-> System.out.println(s));
        useInter(System.out::println);
    }
    public static void useInter(Inter i){
        i.print("hehe");
    }
}
