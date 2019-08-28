package day_twenty_four.singleton_pattern;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:22 2019/3/11
 * @Version: $version$
 * 单例模式 懒汉式
 */
public class Teacher {
    private Teacher(){}
    private static Teacher t=null;
    public synchronized static Teacher getTeacher(){
        if (t==null){
            t=new Teacher();
        }
        return t;
    }
}
