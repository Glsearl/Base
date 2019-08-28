package day_twenty_four.Timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:16 2019/3/6
 * @Version: $version$
 */
public class TimerDemo {
    public static void main(String[] args) {
        Timer t=new Timer();
        t.schedule(new TimerTaskDemo(),2000,3000);

    }
}
class TimerTaskDemo extends TimerTask {

    @Override
    public void run() {
        System.out.println("爆炸了");
    }
}