package Stream.Stream_mathod;

import java.util.stream.Stream;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:37 2019/5/8
 * @Version: $
 *  Stream流中的常用方法_skip:用于跳过元素
 *     如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：
 *     Stream<T> skip(long n);
 *         如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
 */
public class Stream_skip {
    public static void main(String[] args) {
        String[] arr={"喜洋洋","懒洋洋","美羊羊","灰太狼","红太狼"};
        Stream <String> stream = Stream.of(arr);
        Stream <String> stringStream = stream.skip(3);
        stringStream.forEach(name->System.out.println(name));
    }

}
