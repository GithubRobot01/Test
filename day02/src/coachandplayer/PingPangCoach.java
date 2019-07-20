package coachandplayer;

public class PingPangCoach extends Coach implements SpeakEnglish {
    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练讲英语");
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public PingPangCoach() {
    }
}
