package homework_04;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(Inter.num);
        new InterImpl().method();
    }
}

interface Inter {
    int num = 10;
    void method();
}

class InterImpl implements Inter{

    @Override
    public void method() {
        System.out.println("实现了接口中的方法");
    }
}