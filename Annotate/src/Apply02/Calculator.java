package Apply02;

public class Calculator {
    @Check
    public void add() {
        int[] arr={1,2,3};
        System.out.println(arr[3]);
        System.out.println("1 + 0 =" + (1 + 0));
    }
    @Check
    public void sub() {
        System.out.println("1 - 0 =" + (1 - 0));
    }
    @Check
    public void multi() {
        System.out.println("1 * 0 =" + (1 * 0));
    }
    @Check
    public void div() {
        System.out.println("1 / 0 =" + (1 / 0));
    }

    public void show(){
        System.out.println("永无Bug...");
    }
}
