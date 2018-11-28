package day_ten;

public class Student {
    public void study(){
        System.out.println("good good study,day day up");
    }
}
class StudentDemo{
    public void show(Student s){
        s.study();
    }
}
class StudentTest{
    public static void main(String[] args) {
        StudentDemo sd=new StudentDemo();
        Student ss=new Student();
        sd.show(ss);
    }
}