package ThreadMethod;
//void setDaemon?(boolean on)�������̱߳��Ϊ�ػ��̣߳�
// �����е��̶߳����ػ��߳�ʱ��Java��������˳�
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t2.setName("����");
        t3.setName("�ŷ�");

        //�������߳�����
        Thread.currentThread().setName("����");

        //�����ػ��߳�
        t2.setDaemon(true);
        t3.setDaemon(true);

        t2.start();
        t3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}
