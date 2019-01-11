package day_sixteen.Generics;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:54 2018/12/20
 * @Version: $version$
 */
public class GenericsInterfaceDemo {
    public static void main(String[] args) {
        Generice <String> gen=new Generice<String>();
        gen.show("hello");
        Generice <Integer> genr=new Generice<>();
        genr.show(100);
        Geerics ge=new Geerics();
          ge.show("word");
    }

}
