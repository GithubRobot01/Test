package ThisMethodRef_;

public class Husband {
    public void work(){
        System.out.println("工作");
    }

    public void buy(Richable r){
        r.buy();
    }

    public void travel(){
        buy(()->{
            this.work();
        });

        buy(this::work);
    }

    public static void main(String[] args) {
        new Husband().travel();
    }

}
