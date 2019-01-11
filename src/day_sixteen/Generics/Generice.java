package day_sixteen.Generics;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:50 2018/12/20
 * @Version: $version$
 */
public class Generice <E>implements GenericsInterface<E> {
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
class Geerics implements GenericsInterface<String>{

    @Override
    public void show(String s) {
        System.out.println(s);
    }
}