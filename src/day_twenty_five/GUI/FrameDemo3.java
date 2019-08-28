package day_twenty_five.GUI;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:29 2019/3/11
 * @Version: $version$
 */
public class FrameDemo3 {
    public static void main(String[] args) {
        Frame f=new Frame("Test");
        f.setBounds(400,200,400,300);
        f.setVisible(true);
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                //关闭窗口
                System.exit(0);

            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
