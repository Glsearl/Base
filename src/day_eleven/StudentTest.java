package day_eleven;

public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student("张三", 25);
        Student s1 = new Student("李四", 25);
        System.out.println(s.hashCode());
        System.out.println(s.getClass());
        System.out.println(s.equals(s1));
        System.out.println(s.toString());
        System.out.println("-----------------");
        Student s2= (Student) s1.clone();
        System.out.println(s1.equals(s2));
        System.out.println(s2);
        System.out.println("-----------------");
        s1.setAge(90);
        s1.setName("王二");
        System.out.println(s1);
        System.out.println(s2);

    }


}
