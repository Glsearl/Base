package FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:28 2019/4/19
 * @Version: $
 *   java.util.function.Predicate<T>接口
 *     作用:对某种数据类型的数据进行判断,结果返回一个boolean值
 *
 *     Predicate接口中包含一个抽象方法：
 *         boolean test(T t):用来对指定数据类型数据进行判断的方法
 *             结果:
 *                 符合条件,返回true
 *                 不符合条件,返回false
 */
public class PredicateDemo1 {
    public static void method(String str,Predicate<String> pro){
      boolean flag=  pro.test(str);
      System.out.println("是字符串吗？"+flag);
    }

    public static void main(String[] args) {
        method("hello",(s -> s.length()>5 ));
    }
}
