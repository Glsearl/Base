package day_twenty_four.singleton_pattern;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:02 2019/3/11
 * @Version: $version$
 * 单例模式 饿汉式
 */
public class Student {
    private Student(){}
    private static  Student s=new Student();
    public static Student getStudent(){
        return s;
    }
}
