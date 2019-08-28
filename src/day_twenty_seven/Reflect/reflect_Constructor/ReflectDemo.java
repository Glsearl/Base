package day_twenty_seven.Reflect.reflect_Constructor;

import java.lang.reflect.Constructor;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:24 2019/3/29
 * @Version: $version$
 * 反射获取无参构造方法
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        Class c =Class.forName("day_twenty_seven.Reflect.Person");
        //获取所有构造方法，不包括私有方法
//        Constructor[]  con=c.getConstructors();
        //获取所有构造方法，包括私有构造方法
//        Constructor[] con=c.getDeclaredConstructors();
//        for(Constructor cs:con){
//            System.out.println(cs);
//        }
//        获取无参构造方法
        Constructor con=c.getConstructor();
        Object obj=con.newInstance();
        System.out.println(obj);
    }
}
