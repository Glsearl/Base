package Jdk8News;

import java.util.Optional;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:36 2019/4/22
 * @Version: $
 */
public class OptionalDemo {
    public static void main(String[] args) {
        OptionalDemo od=new OptionalDemo();
        Integer i1=null;
        Integer i2=new Integer(10);
        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a=Optional.ofNullable(i1);
        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b=Optional.of(i2);
        System.out.println(sum(a,b));


    }
    public static Integer sum(Optional<Integer> a, Optional<Integer> b){

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - 获取值，值需要存在
        Integer value2 = b.get();
        return value1 + value2;
    }
}
