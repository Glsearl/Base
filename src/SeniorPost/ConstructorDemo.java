package SeniorPost;

public class ConstructorDemo {
    public static void main(String[] args){
        //调用构造函数Constructor(),参数为空
        Constructor c=new Constructor();
        System.out.println(c.name);
        System.out.println(c.speed);
        System.out.println(c.color);
        //调用够着函数Constructor(double speed)，参数为speed
        Constructor c1=new Constructor(233.0);
        System.out.println(c1.speed);

        //调用够着函数Constructor(String name)，参数为name
        Constructor c2=new Constructor("liming");
        System.out.println(c2.name);


        //调用构造函数Car（doubel speed, String name），参数为name和speed
       Constructor c3 = new Constructor(240, "BWM");
        System.out.println(c3.name + " "+c3.speed);
    }


}
