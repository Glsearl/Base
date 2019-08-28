package Stream.Stream_mathod;

import java.util.stream.Stream;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:31 2019/5/8
 * @Version: $
 * Stream流中的常用方法_count:用于统计Stream流中元素的个数
 *     long count();
 *     count方法是一个终结方法,返回值是一个long类型的整数
 *     所以不能再继续调用Stream流中的其他方法了
 */
public class Stream_count {
    public static void main(String[] args) {
        Stream <String> stream = Stream.of("张三", "李四", "王二", "麻子");
        long size=stream.count();
        System.out.println(size);
    }
}
