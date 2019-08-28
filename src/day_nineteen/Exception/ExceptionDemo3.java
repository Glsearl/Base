package day_nineteen.Exception;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:32 2019/1/11
 * @Version: $version$
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int[] arr={1,2,3};
        try{ System.out.println(a/b);
            System.out.println(arr[3]);
//            cach里面可以写多个异常类名
        }catch (ArithmeticException |ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    System.out.println("over");
    }
}
