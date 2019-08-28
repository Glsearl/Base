package day_twenty_three.Thread;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:42 2019/2/25
 * @Version: $version$
 */
public class myThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println(getName()+"-"+i);
        }
    }
}
