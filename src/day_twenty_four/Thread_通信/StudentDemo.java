package day_twenty_four.Thread_通信;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:28 2019/3/4
 * @Version: $version$
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        SetThread st=new SetThread(s);
        GetThread gt=new GetThread(s);
        Thread t1=new Thread(st);
        Thread t2=new Thread(gt);
        t1.start();
        t2.start();
    }
}
