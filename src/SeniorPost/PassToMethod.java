package SeniorPost;

public class PassToMethod {
    public static void main(String[] args){
        int a =10;
        System.out.println("修改之前a的值时"+a);
        changeMe(a);
        System.out.println("修改之后a的值时"+a);
    }

    private static void changeMe(int b) {
        b=(100+b);
        System.out.println(b);
    }
}
