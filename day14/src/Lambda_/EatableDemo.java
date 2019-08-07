package Lambda_;

public class EatableDemo {
    public static void main(String[] args) {
        useEatable(()-> System.out.println("可以吃了!"));
    }
    public static void useEatable(Eatable e){
        e.eat();
    }
}
