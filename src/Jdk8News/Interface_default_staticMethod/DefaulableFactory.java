package Jdk8News.Interface_default_staticMethod;

import java.util.function.Supplier;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:34 2019/4/8
 * @Version: $
 */
public interface DefaulableFactory {
    static Defaulable create(Supplier<Defaulable> supplier){
        return  supplier.get();
    }
}
