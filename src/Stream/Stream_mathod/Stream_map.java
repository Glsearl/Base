package Stream.Stream_mathod;

import java.util.stream.Stream;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:26 2019/5/8
 * @Version: $
 *    Stream流中的常用方法_map:用于类型转换
 *     如果需要将流中的元素映射到另一个流中，可以使用map方法.
 *     <R> Stream<R> map(Function<? super T, ? extends R> mapper);
 *     该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
 *     Function中的抽象方法:
 *         R apply(T t);
 */
public class Stream_map {
    public static void main(String[] args) {
        Stream <String> stream = Stream.of("1", "2", "3", "4");
        Stream <Integer> integerStream = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        integerStream.forEach((Integer i)->{ System.out.println(i);});
    }
}
