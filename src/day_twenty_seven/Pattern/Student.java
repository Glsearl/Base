package day_twenty_seven.Pattern;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:45 2019/4/2
 * @Version: $
 */
public class Student extends Person{
    @Override
    public void eat() {
        for (int i=0;i<10000;i++){
            System.out.println(i);
        }
    }
}
