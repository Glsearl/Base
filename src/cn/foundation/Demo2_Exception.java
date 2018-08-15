package cn.foundation;

public class Demo2_Exception {
    public static void main(String[] args) {

        person p=new person();
        p.setAge(-18);
        System.out.println(p.getAge());

    }

}
class person{
    private String name;
    private int age;
    public person(){
        super();
    }
    public person(String name,int age){
        super();
        this.name =name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {
        if (age>0 && age<150){
            this.age =age;
        }else {
            System.out.println("年龄非法");
            throw new RuntimeException("年龄不合法");
        }
    }
}

