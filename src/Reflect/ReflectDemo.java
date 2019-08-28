package Reflect;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:53 2019/5/14
 * @Version: $
 * 获取Class对象的三种方式
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p=new Person();
        Class c=p.getClass();

        Class c1=Person.class;

        Class c2=Class.forName("Reflect.Person");

        System.out.println(c==c1);
        System.out.println(c1==c2);
    }
}
