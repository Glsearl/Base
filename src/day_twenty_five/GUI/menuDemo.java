package day_twenty_five.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:47 2019/3/14
 * @Version: $version$
 */
public class menuDemo {
    public static void main(String[] args) {
        Frame f=new Frame("一级菜单");
        f.setBounds(400,200,400,300);
        MenuBar mb=new MenuBar();
        Menu m=new Menu("File");
        MenuItem mi=new MenuItem("hello");
        MenuItem mi2=new MenuItem("退出系统");
        mb.add(m);
        m.add(mi);
        m.add(mi2);
        f.setMenuBar(mb);
        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}
