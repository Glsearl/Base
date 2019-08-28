package day_twenty_seven.Reflect.reflect_Constructor;

import java.lang.reflect.Constructor;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:34 2019/3/29
 * @Version: $version$
 *  反射获取带参构造
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        Class c =Class.forName("day_twenty_seven.Reflect.Person");
        Constructor con=c.getConstructor(String.class,int.class,String.class);
        Object obj=con.newInstance("张三",28,"河南");
        System.out.println(obj);
    }
}
