package day_twenty_seven.Reflect.reflect_method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 17:12 2019/3/29
 * @Version: $version$
 * 反射获取成员方法
 */
public class reflectDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("day_twenty_seven.Reflect.Person");
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();
//        获取所有方法，包括父类方法
//        Method[] methods=c.getMethods();
//        获取所有方法，不包括父类方法
//        Method[] methods=c.getDeclaredMethods();
//        for (Method method:methods){
//            System.out.println(method);
//        }
//        调用无参成员方法
        Method method = c.getMethod("show");
        method.invoke(obj);
//        调用有参成员方法
        Method method1 = c.getMethod("getAddress", String.class);
        method1.invoke(obj, "hello");
//        调用有参有返回值成员方法
        Method method2 = c.getMethod("method", String.class, int.class);
        String result = (String) method2.invoke(obj, "张三", 30);
        System.out.println(result);
        Method method3=c.getDeclaredMethod("getName", String.class);
        method3.setAccessible(true);
        method3.invoke(obj,"李四");
    }
}
