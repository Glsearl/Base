package day_twenty_five.GUI;

import java.awt.*;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:50 2019/3/11
 * @Version: $version$
 */
public class FrameDemo2 {
    public static void main(String[] args) {
        Frame f=new Frame("Test");
        f.setVisible(true);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        f.setBounds(400,200,400,300);
//        f.setVisible(true);
    }
}
