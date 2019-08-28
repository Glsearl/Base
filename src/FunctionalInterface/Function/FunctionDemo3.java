package FunctionalInterface.Function;

import java.util.function.Function;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:11 2019/4/19
 * @Version: $
 * Function 接口中有一个默认的andThen 方法，用来进行组合操作。JDK源代码如：
 * default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
 * Objects.requireNonNull(after);
 * return (T t) ‐> after.apply(apply(t));
 * }
 */
public class FunctionDemo3 {
    private static void method(Function <String, Integer> one, Function<Integer, Integer> two) {
        int num = one.andThen(two).apply("10");
        System.out.println(num + 20);
    }
    public static void main(String[] args) {
        method(str ->Integer.parseInt(str)+10, i -> i *= 10);
    }
}
