package day_twenty_seven.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:26 2019/4/1
 * @Version: $
 */
public class Test {
    public static void main(String[] args) {
        StudentDao sd=new StudentDaoImpl();
        MyInvocationHandler handler=new MyInvocationHandler(sd);
      StudentDao rsult=(StudentDao) Proxy.newProxyInstance(sd.getClass().getClassLoader(),sd.getClass().getInterfaces(),handler);
      rsult.add();
      rsult.delete();
      rsult.update();
      rsult.find();
    }
}
