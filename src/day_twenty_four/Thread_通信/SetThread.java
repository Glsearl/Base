package day_twenty_four.Thread_通信;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:24 2019/3/4
 * @Version: $version$
 */
public class SetThread implements Runnable {
    private Student s;
    private int i = 0;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                //如果有数据就等待
                if (s.flag) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (i % 2 == 0) {
                        s.name = "张三";
                        s.age = 20;
                    } else {
                        s.name = "李四";
                        s.age = 30;
                    }
                   i++;
                s.flag = true;
                s.notify();
                }
            }
        }
    }

