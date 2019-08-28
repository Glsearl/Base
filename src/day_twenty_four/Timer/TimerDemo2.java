package day_twenty_four.Timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:23 2019/3/6
 * @Version: $version$
 */
public class TimerDemo2 {
    public static void main(String[] args) {
        Timer t=new Timer();
        t.schedule(new TimerTaskDemo2(t),2000);


    }
}
class TimerTaskDemo2 extends TimerTask {
    private Timer timer;
    public TimerTaskDemo2() {
    }
   public TimerTaskDemo2(Timer timer){
        this.timer=timer;
   }
    @Override
    public void run() {
        System.out.println("爆炸了");
        timer.cancel();

    }


}

