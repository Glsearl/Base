package day_ten;

public abstract class teacher {
    public abstract void  teach();
}
class MathTeacher extends teacher{

    @Override
    public void teach() {
        System.out.println("数学老师教数学");
    }
}
class teacherDemo{
    public void  education(teacher t){
        t.teach();
    }
}
class teacherTest{
    public static void main(String[] args) {
        teacherDemo td= new teacherDemo();
        teacher t=new MathTeacher();
        td.education(t);
    }
}