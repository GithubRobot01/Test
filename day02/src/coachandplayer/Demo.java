package coachandplayer;

public class Demo {
    public static void main(String[] args) {
        PingPangCoach ppc=new PingPangCoach("刘国梁",43);
        ppc.teach();
        ppc.speak();
        ppc.eat();
        System.out.println("=============");
        PingPangPlayer ppp=new PingPangPlayer("马龙",28);
        ppp.study();
        ppp.eat();
        ppp.speak();
    }
}
