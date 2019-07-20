package coachandplayer;

public class BasketballPlayer extends Player{
    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭");
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public BasketballPlayer() {
    }
}
