package Reflect.ReflectConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:10 2019/5/14
 * @Version: $
 * 反射获取无参构造方法
 */
public class Reflect_Constructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c=Class.forName("Reflect.Person");
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        Constructor constructor = c.getConstructor();
        Object obj = constructor.newInstance();
        System.out.println(obj);

    }
}
