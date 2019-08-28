package FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:24 2019/4/19
 * @Version: $
 * 逻辑表达式:可以连接多个判断的条件
 *     &&:与运算符,有false则false
 *     ||:或运算符,有true则true
 *     !:非(取反)运算符,非真则假,非假则真
 *
 *     需求:判断一个字符串,有两个判断的条件
 *         1.判断字符串的长度是否大于5
 *         2.判断字符串中是否包含a
 *     两个条件必须同时满足,我们就可以使用&&运算符连接两个条件
 *
 *     Predicate接口中有一个方法and,表示并且关系,也可以用于连接两个判断条件
 *     default Predicate<T> and(Predicate<? super T> other) {
 *         Objects.requireNonNull(other);
 *         return (t) -> this.test(t) && other.test(t);
 *     }
 *     方法内部的两个判断条件,也是使用&&运算符连接起来的
 */
public class PredicateDemo2 {
   private static boolean method(String str,Predicate<String> pro1,Predicate<String> pro2){
      return pro1.and(pro2).test(str);//等价于 return pro1.test(str)&& pro2.test(str);
    }
    public static void main(String[] args) {
       String s="helloa";
      boolean flag= method(s,(String s1)->{
           return s1.length()>5;
       },(String s1)->{
         return s1.contains("a");
       });
//       简写后的Lambda表达式
//        method(s,s1-> s1.length()>5, s1->s1.contains("a"));
        System.out.println(flag);
    }
}
