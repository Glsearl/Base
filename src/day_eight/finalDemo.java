package day_eight;

/**
 * 1.被final修饰的类不能被继承
 * 2.被final修饰的变量不能被重新赋值，被final修饰之后相当于常量
 * 3.被final修饰的方法不能被重写
 */
public class finalDemo {
    public String name;
    static final int age=20;
    public void show(){
        System.out.println("名字："+name+"年龄"+age);
    }

}
class finalTest extends finalDemo{
    public static void main(String [] args){
       finalDemo fd =new finalDemo();
//        fd.age=30;
        fd.name="张三";
        fd.show();

    }
    public void show(){
        System.out.println("名字："+name+"年龄"+age);
        System.out.println("___________________________");
    }
}