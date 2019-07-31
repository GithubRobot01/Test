package Collection;

import java.util.stream.Stream;

/*
Stream流中的常用方法_concat:用于把流组合到一起
如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Stream_concat {
    public static void main(String[] args) {
        //创建stream流
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六","哈麻皮");
        //获取一个stream流
        String[] arr={"张三","李四","王五"};
        Stream<String> stream2 = Stream.of(arr);
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(name-> System.out.println(name));
    }
}
