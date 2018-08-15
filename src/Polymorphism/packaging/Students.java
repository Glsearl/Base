package Polymorphism.packaging;

public class Students {
    public static void main(String [] args){
        Student stu=new Student();
        stu.setAge(18);
        stu.setId(01);
        stu.setName("张三");
        System.out.println(stu.getAge()+" id is "+stu.getId()+" and "+stu.getAge());
    }
}
