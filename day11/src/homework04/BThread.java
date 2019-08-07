package homework04;

public class BThread implements Runnable{
    private PrizePool pz;

    public BThread(PrizePool pz) {
        this.pz = pz;
    }

    @Override
    public void run() {
        while (true){
            pz.B();
        }
    }
}
