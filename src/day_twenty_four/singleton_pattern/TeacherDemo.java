package day_twenty_four.singleton_pattern;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:26 2019/3/11
 * @Version: $version$
 */
public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t1=Teacher.getTeacher();
        Teacher t2=Teacher.getTeacher();
        System.out.println(t1==t2);
        System.out.println(t1);
        System.out.println(t2);
    }
}
