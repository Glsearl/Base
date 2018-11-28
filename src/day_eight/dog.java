package day_eight;

/**
 *
 */
public class dog extends Animal{
    public static void main(String []args){
        //向上转型
        Animal a=new dog();
        a.eat();
       // 向下转型,从父类转向子类
        dog d= (dog) a;
        d.lookHome();
    }
    public void eat(){
        System.out.println("狗睡觉");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
