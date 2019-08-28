package Reflect.ReflectMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:07 2019/5/14
 * @Version: $
 */
public class Refkect_method {
    public static void main(String[] args)throws Exception {
        Class c=Class.forName("Reflect.Person");
//        Method[] methods = c.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
//          访问不包含父类的方法
//        Method[] declaredMethods = c.getDeclaredMethods();
//        for (Method method : declaredMethods) {
//            System.out.println(method);
//        }
//        访问无参构造方法
        Constructor constructor = c.getConstructor();
        Object obj = constructor.newInstance();
        Method show = c.getMethod("show");
        show.invoke(obj);

        Method getAddress = c.getMethod("getAddress", String.class);
        getAddress.invoke(obj,"郑州");
        Method getName = c.getDeclaredMethod("getName", String.class);
        getName.setAccessible(true);
        getName.invoke(obj,"张飞");
        Method method = c.getMethod("method", String.class, int.class);
        String str = (String) method.invoke(obj, "刘备", 10);
        System.out.println(str);
    }
}
