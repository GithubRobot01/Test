package coachandplayer;

public class PingPangPlayer extends Player implements SpeakEnglish{
    @Override
    public void study() {
        System.out.println("乒乓球远动员学习如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员讲英语");
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    public PingPangPlayer() {
    }
}
