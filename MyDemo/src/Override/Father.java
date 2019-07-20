package Override;

public class Father {
    public Father(){
        System.out.println("父类无参构造方法执行!");
    }
    public Father(int num){
        System.out.println("父类有参构造方法执行!");
    }
    public void play(){
        System.out.println("打电话");
        System.out.println("发信息");
    }
}
