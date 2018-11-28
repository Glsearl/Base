package day_ten;

public class interior {
    private static int a=10;
    private static class innerClass{
        public void show(){
            System.out.println(a);
        }
    }
    public String b="QWER";
    public class student{
        public void notStatic(){
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        //成员内部类是静态的调用方式
        interior.innerClass ic=new interior.innerClass();
        ic.show();
       interior it=new interior();
       it.print();
       innerClass inc=new innerClass();
       inc.show();

    }
    public void print(){
        //成员内部类不是静态的调用方式
        interior.student is=new interior().new student();
        is.notStatic();
    }
}
