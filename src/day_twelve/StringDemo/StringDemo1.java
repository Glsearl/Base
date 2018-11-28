package day_twelve.StringDemo;
/**
String类的构造方法
*/
public class StringDemo1 {
    public static void main(String[] args) {
        String s = new String();
        System.out.println("s=" + s);
        System.out.println("-----------------");
        byte[] b = {97, 98, 99, 100, 101};
        String s1 = new String(b);
        System.out.println(s1);
        System.out.println("-----------------");
        String s2 = new String(b, 1, 3);
        System.out.println(s2);
        System.out.println("-----------------");
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        String s3 = new String(ch);
        System.out.println(s3);
        System.out.println("-----------------");
        String s4 = new String(ch, 1, 3);
        System.out.println(s4);
        System.out.println("-----------------");
        String s5=new String("xyz");
        System.out.println(s5);
    }
}
