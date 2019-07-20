package ThreadImpl;
//static void sleep(long mills):使当前正在执行的线程以指定毫秒数暂停(暂时停止执行)
//毫秒数结束之后,线程继续执行
public class SleepDemo {
    public static void main(String[] args) {
        for (int i = 10; i >=0; i--) {
            System.out.println("倒计时:"+i);
            try {
                //使用Thread类中的sleep方法让程序睡眠1秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
