
import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadAppply {
    //
    private static BlockingQueue<String> blockingQueue =  new LinkedBlockingQueue<String>(1000);

    public static void main(String[] args) throws IOException {
        action();
    }
    public static void action(){
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Deal(blockingQueue));
           // new Deal(blockingQueue).start();
        }
        new Reader(blockingQueue).run();

    }
}

class Deal extends Thread{
    private BlockingQueue<String> blockingQueue;

    public Deal(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while(true){
            try {
                String str = blockingQueue.take();
                System.out.println(str);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class Reader implements Runnable {
    private BlockingQueue<String> blockingQueue;

    public Reader(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        /* 读取数据 */
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:\\File\\test.doc")), "UTF-8"));
            String lineTxt = null;
            while ((lineTxt = br.readLine()) != null) {
                blockingQueue.put(lineTxt);
            }
            br.close();
        } catch (Exception e) {

        }
    }
}

