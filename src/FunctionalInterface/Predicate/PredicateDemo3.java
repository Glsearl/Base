package FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:35 2019/4/19
 * @Version: $
 *
需求:判断一个字符串,有两个判断的条件
1.判断字符串的长度是否大于5
2.判断字符串中是否包含a
满足一个条件即可,我们就可以使用||运算符连接两个条件

Predicate接口中有一个方法or,表示或者关系,也可以用于连接两个判断条件
default Predicate<T> or(Predicate<? super T> other) {
Objects.requireNonNull(other);
return (t) -> test(t) || other.test(t);
}
方法内部的两个判断条件,也是使用||运算符连接起来的
 */
public class PredicateDemo3 {
    public static boolean method(String str, Predicate<String> pre1,Predicate<String> pre2){
//        return pre1.test(str) ||pre2.test(str);
       return pre1.or(pre2).test(str);
    }

    public static void main(String[] args) {
        String s="asdf";
       boolean flag= method(s,(String s1)->{
            return s1.length()>5;
        },(String s1)->{
            return s1.contains("a");
        });
       System.out.println(flag);
    }
}
