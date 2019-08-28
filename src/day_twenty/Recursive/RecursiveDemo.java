package day_twenty.Recursive;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 14:38 2019/1/17
 * @Version: $version$
 * 用递归实现5的阶乘
 */
public class RecursiveDemo {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}
