package day_twenty_seven.Reflect.reflect_Field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:42 2019/3/29
 * @Version: $version$
 * 反射获取成员变量
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("day_twenty_seven.Reflect.Person");
//        获取所有成员变量，包括私有变量
//        Field[] fields=c.getDeclaredFields();
        //        获取所有成员变量，不包括私有变量
        Field[] fields = c.getFields();
        for (Field fie : fields) {
            System.out.println(fie);
        }
//        获取私有成员变量
        Field field = c.getDeclaredField("name");
//       暴力访问
        field.setAccessible(true);
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();
        field.set(obj, "张三");
        System.out.println(obj);
        System.out.println("-----------");
//        获取默认权限成员变量
        Field field2 = c.getDeclaredField("age");
//       暴力访问
        field2.setAccessible(true);
        field2.set(obj, 30);
        System.out.println(obj);
        System.out.println("-----------");
        //        获取public权限成员变量
        Field field3 = c.getField("address");
        field3.set(obj, "北京");
        System.out.println(obj);
        System.out.println("-----------");
    }
}
