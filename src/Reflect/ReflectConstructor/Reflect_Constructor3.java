package Reflect.ReflectConstructor;

import java.lang.reflect.Constructor;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:53 2019/5/14
 * @Version: $
 */
public class Reflect_Constructor3 {
    public static void main(String[] args) throws Exception {
        Class c=Class.forName("Reflect.Person");
        Constructor declaredConstructor = c.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Object obj = declaredConstructor.newInstance("王骥德", 20);
        System.out.println(obj);


    }
}
