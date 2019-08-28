package Method_references.StaticMethodReferences;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:45 2019/5/13
 * @Version: $
 */
public class CalcableTest {
    public static int absNumber(int i,Calcable c){
        return c.calc(i);
    }

    public static void main(String[] args) {
        int a=absNumber(-10,(int i)->{return Math.abs(i);});
       System.out.println(a);
       int b= absNumber(-20,Math::abs);
       System.out.println(b);
    }
}
