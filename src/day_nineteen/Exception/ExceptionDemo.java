package day_nineteen.Exception;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:13 2019/1/11
 * @Version: $version$
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("over");
    }
}
