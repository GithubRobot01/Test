package Fun;

public class PrintTest {
    public static void main(String[] args) {
        usePrinter(s -> System.out.println(s.toUpperCase()));
        PrintString ps=new PrintString();
        usePrinter(ps::printUpper);

    }
    public static void usePrinter(Printer p){
        p.PrintUpperCase("HeLlO");
    }
}
