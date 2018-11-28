package day_ten;

class Student1 {
        public void study(){
            System.out.println("good good study,day day up");
        }
    public Student1 show(){
        Student1 s= new Student1();
        return s;
    }
}
class StudentTest1{
        public static void main(String[] args) {
       Student1 s1=new Student1();
       Student1 s=s1.show();
        }
    }
