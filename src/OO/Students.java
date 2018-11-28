package OO;

public class Students {
    public void print(Students s){
        System.out.println("类对象");
    }
}
class StudentsDemo{
    public static void main(String[] args){
        Students students=new Students();
        students.print(students);
    }
}