package SeniorPost;

public class Widget {
    private int id;
    private  static int numberOfWidgets = 0;
    public  Widget(){
        System.out.println("类的实例在初始化的时候先执行构造方法");
        //numberOfWidgets先自增，然后赋值给变量id
        id =++numberOfWidgets;
    }
    //新建一个实例方法，返回实例变量id的值
    public  int getID(){
        return id;
    }
    //新建一个静态方法
    public static  int getNumberOfWidgets(){
        return numberOfWidgets;
    }
}
