package ThreadMethod;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.setName("����");
        t2.setName("�İ���");
        t3.setName("�˰���");
        //void join()���ȴ�����߳�����
        t1.start();
        //ֻ�����߳�1ִ����֮��,�߳�2��3�ſ�ʼִ��
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
