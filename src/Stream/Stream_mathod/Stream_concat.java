package Stream.Stream_mathod;

import java.util.stream.Stream;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:59 2019/5/8
 * @Version: $
 *  Stream流中的常用方法_concat:用于把流组合到一起
 *     如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
 *     static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Stream_concat {
    public static void main(String[] args) {
        Stream <String> stream = Stream.of("张三丰", "张无忌");
        Stream <String> stream1 = Stream.of("周生生", "周媛");
        Stream <String> concat = Stream.concat(stream, stream1);
        concat.forEach(s ->System.out.println(s));
    }
}
