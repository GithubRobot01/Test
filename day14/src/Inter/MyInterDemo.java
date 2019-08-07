package Inter;

public class MyInterDemo {
    public static void main(String[] args) {
        MyInter m=new MyInterImpl();
        m.show();

        new MyInter(){
            @Override
            public void show() {
                System.out.println("重写接口中的默认方法");
            }
        }.show();
    }
}
