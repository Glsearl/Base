package day_twenty_five.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:13 2019/3/14
 * @Version: $version$
 */
public class menuDemo2 {
    public static void main(String[] args) {
        Frame f=new Frame("多级菜单");
        f.setBounds(400,200,400,300);
        MenuBar mb=new MenuBar();
        Menu m=new Menu("File");
        Menu m2=new Menu("Open");
        MenuItem mi=new MenuItem("hello");
        MenuItem mi2=new MenuItem("退出系统");
        MenuItem mi3=new MenuItem("好好学习");
        MenuItem mi4=new MenuItem("天天向上");
        MenuItem mi5=new MenuItem("复原");
        mb.add(m);
        m.add(m2);
        m.add(mi);
        m.add(mi2);
        m2.add(mi3);
        m2.add(mi4);
        m2.add(mi5);
        f.setMenuBar(mb);
        mi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("好好学习");
            }
        });
        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("天天向上");
            }
        });
        mi5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("多级菜单");
            }
        });
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
