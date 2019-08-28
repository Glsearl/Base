package Jdk8News.Interface_default_staticMethod;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:20 2019/4/8
 * @Version: $
 */
public interface Defaulable {
    default String notRequired(){
        return "Default implementation";
    }
}
class DefaulableImpl implements Defaulable{

}
class OverridableImpl implements Defaulable{
    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}