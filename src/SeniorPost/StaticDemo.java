package SeniorPost;

public class StaticDemo {
    public static void  main(String[] args){
        Widget w1 =new Widget();
        Widget w2 = new Widget();
        System.out.println(w1.getID());
        System.out.println(w2.getID());
        System.out.println("一共有多少个Widget？"+Widget.getNumberOfWidgets());
    }
}
