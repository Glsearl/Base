package day_twenty_seven.Reflect;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 14:55 2019/3/29
 * @Version: $version$
 * 反射获取Class对象的三种方式
 */
public class ReflectDemo {
    public static void main(String[] args)throws Exception {
        Person p=new Person();
        Class c=p.getClass();
      Person p2=new Person();
      Class c2=p.getClass();
      System.out.println(p==p2);
      System.out.println(c==c2);

      Class c3=Person.class;
      System.out.println(c==c3);

      Class cla =Class.forName("day_twenty_seven.Reflect.Person");
      System.out.println(c==cla);
    }
}
