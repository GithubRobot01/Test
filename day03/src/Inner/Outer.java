package Inner;

public class Outer {
    private class Inner implements InnerInter {
        public void show() {
            System.out.println("内部类method方法");
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public void method() {
        Inner in = new Inner();
        in.show();
    }
}
