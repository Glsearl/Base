package Jdk8News.Interface_default_staticMethod;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:37 2019/4/8
 * @Version: $
 */
public class Test {
    public static void main(String[] args) {
        Defaulable defaulable=DefaulableFactory.create(DefaulableImpl::new);
        System.out.println(defaulable.notRequired());

        defaulable=DefaulableFactory.create(OverridableImpl::new);
        System.out.println(defaulable.notRequired());
    }

}
