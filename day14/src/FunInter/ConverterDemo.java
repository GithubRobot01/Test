package FunInter;

public class ConverterDemo {
    public static void main(String[] args) {
        useConverter(s->Integer.parseInt(s));
        useConverter(Integer::parseInt);
    }

    public static void useConverter(Converter c){
        int num=c.con("123");
        System.out.println(num);
    }
}
