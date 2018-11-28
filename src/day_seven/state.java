package day_seven;

public class state {
    private  String name;
       private int age;
       static String Country;
       public state(){

       }

    public void setName(String name) {

           this.name = name;
    }

    public void setAge(int age) {

           this.age = age;
    }

    public state(String name, int age){

       }
       public state(String name,int age,String Country){

    }
    public void show(){
        System.out.println("名字:"+name+"年龄"+age+"国籍"+Country);
    }
}
