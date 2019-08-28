package day_twenty_seven.Reflect.reflect_Constructor;

import java.lang.reflect.Constructor;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:38 2019/3/29
 * @Version: $version$
 * 反射获取私有构造方法
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        Class c =Class.forName("day_twenty_seven.Reflect.Person");
        Constructor con=c.getDeclaredConstructor(String.class,int.class);
//        暴力访问
        con.setAccessible(true);
        Object obj=con.newInstance("李四",20);
        System.out.println(obj);

    }
}
