package day_twenty.Recursive;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:53 2019/1/17
 * @Version: $version$
 * 古典问题：3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 兔子问题(斐波那契数列)
 */
public class RabbitNumber {
    public static void main(String[] args) {
      System.out.println(rabbitNumbers(20));
    }
    public static int  rabbitNumbers(int n){
        int a=1;
        int b=1;
        if (n==1 ||n==2){
            return 1;
        }else {
         return rabbitNumbers(n-1)+rabbitNumbers(n-2);
    }
  }
}
