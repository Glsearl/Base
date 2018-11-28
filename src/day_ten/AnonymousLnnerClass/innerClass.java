package day_ten.AnonymousLnnerClass;

public abstract class innerClass {
    public abstract void show();

}
class innerDemo{
    public void abc(){
        innerClass ic=new innerClass(){

            @Override
            public void show() {
           System.out.println("这是一个匿名内部类");
            }
        };
        ic.show();
    }

}
class Test{
    public static void main(String[] args) {
        innerDemo id=new innerDemo();
        id.abc();
    }
}