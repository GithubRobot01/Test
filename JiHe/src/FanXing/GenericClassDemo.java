package FanXing;

public class GenericClassDemo {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        GenericClass<Integer> gc=new GenericClass<Integer>();
        gc.setName(1); //自动装箱
        int name = gc.getName(); //自动拆箱
        System.out.println(name);
        GenericClass<String> gc1=new GenericClass<String>();
        gc1.setName("小明");
        String name1 = gc1.getName();
        System.out.println(name1);
    }
}
