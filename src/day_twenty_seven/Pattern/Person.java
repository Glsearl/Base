package day_twenty_seven.Pattern;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:35 2019/4/2
 * @Version: $
 */
public abstract class Person {
   public void getTime(){
       long start=System.currentTimeMillis();
        eat();
       long end=System.currentTimeMillis();
       System.out.println("程序执行时间："+(end-start)+"毫秒");
   }
 public abstract void eat();
}
