package day_sixteen.Generics;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:58 2018/12/20
 * @Version: $version$
 */
public class GenericsClassDemo {
    public static void main(String[] args) {
        GenericsClass<String> gs=new GenericsClass <>();
       gs.setE("hello");
       String s=gs.getE();
       System.out.println(s);
        GenericsClass<Integer> gsi=new GenericsClass <>();
        gsi.setE(100);
        Integer i=gsi.getE();
        System.out.println(i);

    }
}
