package Lambda_;

public class AddableDemo {
    public static void main(String[] args) {
        useAddable((x,y)->x+y);
    }
    public static void useAddable(Addable a){
        int sum= a.add(20,15);
        System.out.println(sum);
    }
}
