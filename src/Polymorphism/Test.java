package Polymorphism;

public class Test {
    public static void main(String[] args){
        Student st =new bigStudent();
        Student st1=new littleStudent();
        System.out.println(st.getAge());
        System.out.println(st1.getAge());
    }
}
