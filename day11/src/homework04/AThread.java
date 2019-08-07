package homework04;

public class AThread implements Runnable{
    private PrizePool pz;

    public AThread(PrizePool pz) {
        this.pz = pz;
    }

    @Override
    public void run() {
        while (true){
            pz.A();
        }
    }
}
