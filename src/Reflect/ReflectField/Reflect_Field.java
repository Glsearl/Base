package Reflect.ReflectField;

import java.lang.reflect.Field;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:38 2019/5/14
 * @Version: $
 */
public class Reflect_Field {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c=Class.forName("Reflect.Person");
//        Field[] fields = c.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
//        Field[] declaredFields = c.getDeclaredFields();
//        for (Field field : declaredFields) {
//            System.out.println(field);
//        }
        Field field = c.getField("address");
        String name = field.getName();
        System.out.println(name);
        Field field1= c.getDeclaredField("name");
        String name2 = field1.getName();
        System.out.println(name2);
    }
}
