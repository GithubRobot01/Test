package Inter;

public interface MyInter {
    default void show(){
        System.out.println("接口中的默认方法");
    }
}
