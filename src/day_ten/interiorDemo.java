package day_ten;

public class interiorDemo {
      public int num=10;
      class inner{
          public int num = 20;
          public void show() {
              int num = 30;
              System.out.println(num);//就近原则，会打印当前方法内的num变量
              System.out.println(this.num);//打印当前类的num变量
              System.out.println(interiorDemo.this.num);//打印外部类对象的num变量
              System.out.println(new interiorDemo().num);//打印外部类对象的num变量

          }
      }
}
