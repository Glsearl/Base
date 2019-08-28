package day_twenty_four.singleton_pattern;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:19 2019/3/11
 * @Version: $version$
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s1=Student.getStudent();
        Student s2=Student.getStudent();
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
