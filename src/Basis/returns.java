package Basis;

public class returns {
    public static void  main(String[] args){
        //调用sayHrllo方法
        sayHello("Gaols");
        System.out.println(Max(57,89));
    }
    public static void sayHello(String name){
        System.out.println("Hello"+name);
    }
    public static int Max(int a,int b){
      if (a>b){
          return a;
      } else {
          return b;
      }
    }
}
