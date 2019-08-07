package ThreadMethod;
//static void sleep(long millis)��
// ʹ��ǰ����ִ�е��߳�ͣ������ִͣ�У�ָ���ĺ�����
public class ThreadSleepDemo {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                }
            }
        }.start();
    }
}
