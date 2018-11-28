package day_eight;

public class cat extends Animal{
    public static void main(String []args){
        //向上转型
        Animal a= new cat();
        a.eat();
        // 向下转型,从父类转向子类
       cat a1= (cat) a;
        a1.palyGame();
    }
    public void eat(){
        System.out.println("毛睡觉");
    }
    public void palyGame(){
        System.out.println("毛玩游戏");
    }
}

