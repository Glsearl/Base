package Reflect.ReflectConstructor;
import java.lang.reflect.Constructor;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 14:52 2019/5/14
 * @Version: $
 * 反射获取带参构造方法
 */
public class Reflect_Constructor2 {
    public static void main(String[] args) throws Exception {
        Class c=Class.forName("Reflect.Person");
        Constructor constructor = c.getConstructor(String.class,int.class,String.class);
        Object obj = constructor.newInstance("战三",20,"北京");
        System.out.println(obj);
    }
}
