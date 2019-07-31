package Generic;

public class InterImpl<E> implements Inter<E> {
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
