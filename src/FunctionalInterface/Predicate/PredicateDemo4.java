package FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:41 2019/4/19
 * @Version: $
 *  需求:判断一个字符串长度是否大于5
 *         如果字符串的长度大于5,那返回false
 *         如果字符串的长度不大于5,那么返回true
 *     所以我们可以使用取反符号!对判断的结果进行取反
 *
 *     Predicate接口中有一个方法negate,也表示取反的意思
 *     default Predicate<T> negate() {
 *         return (t) -> !test(t);
 */
public class PredicateDemo4 {
    private static boolean method(String str, Predicate<String> pre1){
        return pre1.negate().test(str);
    }
    public static void main(String[] args) {
     String s="helood";
    boolean flag= method(s,(String ss)->{
         return ss.length()>5;
     });
    System.out.println(flag);
    }
}
