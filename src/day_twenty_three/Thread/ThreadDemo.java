package day_twenty_three.Thread;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:44 2019/2/25
 * @Version: $version$
 * 设置线程名字 public final synchronized void setName(String name)
 * 启动线程   public synchronized void start() 注意：直接调用run方法，其实走的还是单线程，并不是多线程
 * 如何获取当前对象运行的线程名称？
 * public static native Thread currentThread()  返回的是Thread
 * Thread.currentThread().getName()
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        myThread mt=new myThread();
//        myThread mt2=new myThread();
//        mt.setName("张三");
//        mt2.setName("李四");
//        mt.start();
//        mt2.start();
        System.out.println(Thread.currentThread().getName());
    }
}
