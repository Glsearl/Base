package day_thirteen.StringBuffer;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:13 2018/11/27
 * @ Version: v1.0
 */
//StringBuffer的构造方法
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println("------------------------------------");

        StringBuffer sb1 = new StringBuffer(20);
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        System.out.println("------------------------------------");

        StringBuffer buffer = new StringBuffer("hello word");
        System.out.println(buffer);
        System.out.println(buffer.length());
        System.out.println(buffer.capacity());
        System.out.println("------------------------------------");

    }
}
