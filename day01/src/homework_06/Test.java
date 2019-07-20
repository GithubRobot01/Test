package homework_06;

public class Test {
    public static void main(String[] args) {
        BaseTeacher bt=new BaseTeacher("张三",23);
        System.out.println(bt.getName()+"老师..."+bt.getAge());
        bt.teach();
        WorkTeacher wt=new WorkTeacher("李四",24);
        System.out.println(wt.getName()+"老师..."+wt.getAge());
        wt.teach();
    }
}
