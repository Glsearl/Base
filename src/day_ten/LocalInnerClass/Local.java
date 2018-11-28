package day_ten.LocalInnerClass;

public class Local {
    public void show(){
        class friend{
          public void print(){
              System.out.println("局部内部类");
          }
        }
       friend friend=new friend();
        friend.print();
    }

}
class Demo{
    public static void main(String[] args) {
        System.out.println("_______________________________");
        Local local=new Local();
        local.show();
    }

}