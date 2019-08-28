package Stream.Stream_mathod;

import java.util.stream.Stream;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:20 2019/5/8
 * @Version: $
 *  Stream流中的常用方法_filter:用于对Stream流中的数据进行过滤
 *     Stream<T> filter(Predicate<? super T> predicate);
 *     filter方法的参数Predicate是一个函数式接口,所以可以传递Lambda表达式,对数据进行过滤
 *     Predicate中的抽象方法:
 *         boolean test(T t);
 */
public class Stream_filter {
    public static void main(String[] args) {
        Stream <String> stream = Stream.of("张无忌", "张三疯", "周芷若", "韦一笑");
        Stream <String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        stream1.forEach((String name)->{System.out.println(name);});
    }

}
