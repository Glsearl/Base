package FunctionalInterface.Function;

import java.util.function.Function;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:56 2019/4/19
 * @Version: $
 *  java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
 *         前者称为前置条件，后者称为后置条件。
 *     Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
 *         使用的场景例如：将String类型转换为Integer类型。
 */
public class FunctionDemo1 {
    private static void method(String str, Function<String,Integer> fun){
       int i= fun.apply(str);
       System.out.println(i);
    }
    public static void main(String[] args) {
//        method("123",(String s)->{
//          return   Integer.parseInt(s);
//        });
//        优化后的Lambda表达式
        method("123",s ->Integer.parseInt(s));

    }
}
