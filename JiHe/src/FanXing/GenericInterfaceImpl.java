package FanXing;
/*
含有泛型的接口,第一种使用方式:定义接口的实现类,实现接口,指定接口的泛型
    public interface Iterator<E>{
      E next();
    }
    Scanner类实现了Iterator接口,并指定接口的泛型为String,所以重写的next方法默认泛型为String
    public final class Scanner implements Iterators<String>{
        public string next(){}
    }
*/
public class GenericInterfaceImpl implements GenericInterface<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
