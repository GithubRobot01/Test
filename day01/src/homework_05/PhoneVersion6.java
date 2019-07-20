package homework_05;

public class PhoneVersion6 extends PhoneVersion5 {
    @Override
    public void speak(){
        super.speak();
        System.out.println("说中文");
    }
}