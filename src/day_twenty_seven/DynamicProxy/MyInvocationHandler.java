package day_twenty_seven.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:22 2019/4/1
 * @Version: $
 */
public class MyInvocationHandler implements InvocationHandler {
    public Object obj;

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        Object result = method.invoke(obj, args);
        System.out.println("日志记录");
        return result;
    }
}
